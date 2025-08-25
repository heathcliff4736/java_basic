package java_advanced_01.day20.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx02 {
    public static void main(String[] args) {
        try {
            // 1. 리소스 객체를 대상으로 입력스트림을 생성
            InputStream is = new FileInputStream("C:/Temp/test2.db");

            byte[] array = new byte[100];

            // 2. 리소스의 데이터가 존재한다면 읽어온다.
            while (true) {
                int data = is.read(array);   // 최대 100byte를 읽고 읽은 바이트는 array에 저장, 읽은 바이트 수 만큼 정수값 리턴하여 data에 저장
                // 파일은 끝이 있다. EOF (End Of File) => -1
                if (data == -1) break;  // -1을 리턴했을 경우 while문 종료

                for (int i = 0; i < data; i++) {
                    System.out.println(array[i]);
                }
            }

            // 3. 다 읽었으면 입력스트림 닫기
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
