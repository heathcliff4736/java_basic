package java_advanced_01.day22.net.socket01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketEx {

    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("-----------Starting server socket-----------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 입력하세요!");
        System.out.println("--------------------------------------------");

        // TCP 서버 시작
        startServer();

        // 키보드 입력
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }

        // TCP 서버 종료
        stopServer();

    }

    public static void startServer() {
        // 스레드 Thread : 실행 단위
        Thread thread = new Thread() {
            @Override
            public void run() {

                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[Server has successfully started]");
                    while (true) {
                        System.out.println("\n[Server] waiting for connection...");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트의 정보 얻기
                        InetSocketAddress iA = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("\n[Server] " + iA.getAddress() + ":" + iA.getPort());

                        // 연결 끊기
                        socket.close();
                        System.out.println("\n[Server] closed");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버 종료]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
