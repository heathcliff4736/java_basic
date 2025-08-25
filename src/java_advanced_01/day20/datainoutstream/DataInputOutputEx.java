package java_advanced_01.day20.datainoutstream;

import java.io.*;

public class DataInputOutputEx {
    public static void main(String[] args) throws Exception {

        // 데이터 입출력객체 생성
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("primitive.db");
        dos = new DataOutputStream(fos);

        dos.writeUTF("엄현석");
        dos.writeInt(10);
        dos.writeDouble(3.14);
        dos.writeBoolean(Boolean.TRUE);

        dos.flush();
        dos.close();
        fos.close();

        // DataInputStream 객체
        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("primitive.db");
        dis = new DataInputStream(fis);

        String name = dis.readUTF();
        int age = dis.readInt();
        double price = dis.readDouble();
        boolean flag = dis.readBoolean();
        System.out.println(name + "," + age + "," + price + "," + flag);

        /*
        for (int i = 0; i < 4; i++) {

        }*/

        dis.close();
        fis.close();



    }
}
