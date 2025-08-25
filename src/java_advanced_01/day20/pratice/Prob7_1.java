package java_advanced_01.day20.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7_1 {

    public static void main(String[] args) throws IOException {
        String originalFileName = "C:/Temp/image1.jpg";
        InputStream is = new FileInputStream(originalFileName);

        byte[] buffer = new byte[1024];
        int totalBytes = 0;   // 파일 크기 누적

        int numRead;
        while ((numRead = is.read(buffer)) != -1) {
            totalBytes += numRead;
        }

        is.close();

        System.out.println("파일 크기: " + totalBytes + " bytes");
    }
}
