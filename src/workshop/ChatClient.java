package workshop;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatClient {
    public static void main(String[] args) {
        int port = 5001;
        String host = "127.0.0.1";

        try (
                Socket socket = new Socket(host, port);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                PrintWriter out = new PrintWriter(
                        new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true
                );
                BufferedReader keyboard = new BufferedReader(
                        new InputStreamReader(System.in, StandardCharsets.UTF_8))
        ) {
            System.out.println("[Client] Connected to " + host + ":" + port);
            String greet = in.readLine();
            if (greet != null) System.out.println(greet);

            System.out.print("Enter your Nickname: ");
            String nickname = in.readLine();
            out.println(nickname);
            if(nickname.startsWith("NICK ")) {
                nickname = nickname.substring(nickname.indexOf(nickname) + 5);
                out.println(nickname);
            }
            String msg;
            while (true) {
                System.out.print("You> ");
                msg = keyboard.readLine();
                if(msg == null) break;
                out.println(msg);

                String resp = in.readLine();
                if (resp == null) {
                    System.out.println("[Client] Server terminated");
                    break;
                }
                System.out.println(resp);
                if ("exit".equalsIgnoreCase(msg.trim())) break;
            }
            System.out.println("[Client] Disconnected");
        } catch (IOException e) {
            System.err.println("[Server] I/O error: " + e.getMessage());
        }
    }
}
