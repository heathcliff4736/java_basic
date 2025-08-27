package java_advanced_01.day22.net.multiserverecho;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 5000;

        try (
             Socket socket = new Socket(host, port);
             // in : 서버에서 오는 데이터 읽음
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             // out : 서버로 메시지 보냄
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
             // keyboard : 사용자 키보드 입력 받음
             BufferedReader keyboard = new BufferedReader(
                     new InputStreamReader(System.in, StandardCharsets.UTF_8))
        ) {
            System.out.println("[Client] Connected to " + host + ":" + port);
            // 서버의 첫 인사 수신
            String greet = in.readLine();
            if (greet != null) System.out.println(greet);

            String msg;
            while (true) {
                System.out.print("You> ");
                msg = keyboard.readLine();      // 키보드 입력
                if (msg == null) break;  // EOF (Ctrl+D/Ctrl+Z)
                out.println(msg);               // 서버로 전송

                String resp = in.readLine();    // 서버 응답
                if (resp == null) {
                    System.out.println("[Client] Server closed connection.");
                    break;
                }
                System.out.println(resp);       // 서버 응답 출력

                if ("exit".equalsIgnoreCase(msg.trim())) break;
            }
            System.out.println("[Client] Bye.");
        } catch (IOException e) {
            System.err.println("[Client] Error: " + e.getMessage());
        }
    }
}
