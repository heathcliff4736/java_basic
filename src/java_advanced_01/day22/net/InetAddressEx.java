package java_advanced_01.day22.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 자신의 컴퓨터의 IP주소를 얻어내는 방법
public class InetAddressEx {
    public static void main(String[] args) {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress);
            InetAddress[] iaAddress = InetAddress.getAllByName("www.naver.com");
            for (int i = 0; i < iaAddress.length; i++) {
                InetAddress address = iaAddress[i];
                System.out.println(address);                            }

        } catch (UnknownHostException e) {
            throw new ExceptionInInitializerError(e.getMessage());
        }

    }
}
