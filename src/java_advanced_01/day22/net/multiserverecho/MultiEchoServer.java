package java_advanced_01.day22.net.multiserverecho;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiEchoServer {
    private static final int PORT = 5000;
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    // 스레드 풀 : 클라이언트 연결이 생길 때마다 새 스레드를 만들어 처리
    private static final AtomicInteger CLIENT_SEQ = new AtomicInteger(1);
    // 클라이언트에 번호를 붙이기 위한 카운터 (1번, 2번, ...)

    public static void main(String[] args) {
        System.out.println("[Server] Starting on port " + PORT);
        // Ctrl+C 시 스레드 풀 정리
        // (서버를 Ctrl+C로 종료할 때 스레드 풀을 정리하도록 훅(hook) 등록)
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[Server] Shutting down...");
            POOL.shutdownNow();
        }));

        // ServerSocket을 열어서 5000번 포트 대기 (서버 종료시 자동 close)
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                // 클라이언트에게 번호 할당
                int id = CLIENT_SEQ.getAndIncrement();
                // 클라이언트의 IP, 포트 출력
                System.out.println("[Server] Client#" + id + " connected from " + socket.getRemoteSocketAddress());
                // 클라이언트 처리 -> 별도 스레드에서 실행 (스레드 풀에 ClientHandler작업 제출)
                // 서버는 다시 accept()로 돌아가서 다음클라이언트 기다림 -> 멀티 클라이언트 동시 처리 가능
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
                    // BufferedReader로 Client가 보낸 문자열 읽기
                    BufferedReader in = new BufferedReader(                            
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    // 클라이언트에게 문자열 전송
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)
            ) {
                out.println("Welcome! You are Client#" + clientId + ". Type 'exit' to quit.");
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("[Server] From Client#" + clientId + ": " + line);
                    if ("exit".equalsIgnoreCase(line.trim())) {
                        out.println("Bye Client#" + clientId);
                        break;
                    }
                    // 받은 메시지를 그대로 돌려주는 에코
                    out.println("Echo to #" + clientId + ": " + line);
                }
            } catch (IOException e) {
                System.err.println("[Server] Client#" + clientId + " I/O error: " + e.getMessage());
            } finally {
                try { socket.close(); } catch (IOException ignored) {}
                System.out.println("[Server] Client#" + clientId + " disconnected.");
            }
        }
    }
}
