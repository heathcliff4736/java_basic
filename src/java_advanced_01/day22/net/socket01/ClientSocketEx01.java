package java_advanced_01.day22.net.socket01;

import java.net.Socket;

public class ClientSocketEx01 {
    public static void main(String[] args) {
        // Socket 생성과 동시에 localhost 또는 IP의 Port의 연결 요청
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("successfully connected to server");

            socket.close();
            System.out.println("connection closed");
        } catch (Exception e) {
            System.out.println("failed to connect to server");
        }

    }
}
