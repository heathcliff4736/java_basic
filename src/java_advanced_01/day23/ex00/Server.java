package java_advanced_01.day23.ex00;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static ServerSocket serverSocket;

    public static void main(String[] args) {

        try {

            serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            System.out.println("[Server] successfully connected to server");
            socket.close();
            System.out.println("[Server] disconnected to server");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
