package java_advanced_01.day23.ex00;

import java.io.IOException;
import java.net.Socket;

public class Client {
    Socket socket = null;

    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost", 5000);
            System.out.println("successfully connected to server");
            socket.close();
            System.out.println("disconnected to server");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
