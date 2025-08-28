package workshop;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ChatServer {
    private static final int PORT = 5001;
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    private static final AtomicInteger CLIENT_SEQ = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println("Server starting on port " + PORT);

        // Ctrl+C 시 스레드 풀 정리 (서버를 Ctrl+C로 종료할 때 스레드 풀을 정리하도록 훅(hook) 등록)
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[Server] Shutting down...");
            POOL.shutdownNow();
        }));

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                // 클라이언트에게 번호 할당
                int id = CLIENT_SEQ.getAndIncrement();
                System.out.println("[Server] Client#" + id + " connected from " + socket.getRemoteSocketAddress());
                POOL.submit(new ClientHandler(socket, id));
            }
        } catch (IOException e) {
            System.err.println("[Server] Error: " + e.getMessage());
        }

    }

    private static class ClientHandler implements Runnable {
        private final Socket socket;
        private final int clientId;

        ClientHandler(Socket socket, int clientId) {
            this.socket = socket;
            this.clientId = clientId;
        }

        @Override
        public void run() {
            try (
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)
            ) {

                out.println("Welcome! You are Client#" + clientId + ". Type 'exit' to quit.");

                String nickname = in.readLine();
                if(nickname.startsWith("NICK ")) {
                    nickname = nickname.substring(nickname.indexOf(nickname) + 5);
                    out.println(nickname);
                    System.out.println("[Server] Client #" + clientId + ": " + nickname);
                }

                out.println(nickname+" joined");
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("[Server] From Client#" + clientId + ": " + line);
                    if ("exit".equalsIgnoreCase(line.trim())) {
                        out.println("Bye!");
                        break;
                    }
                    out.println("Echo to #"+clientId+":"+line);
                }
            } catch (IOException e) {
                System.err.println("[Server] Client#" + clientId + " I/O error: " + e.getMessage());
            } finally {
                try {
                    socket.close();
                } catch (IOException ignored) {}
                System.out.println("[Server] Client#" + clientId + " disconnected.");
            }

        }


    }
}
