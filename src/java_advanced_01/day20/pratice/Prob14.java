package java_advanced_01.day20.pratice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//문제 : 정수 배열 {5,10,15,20}를 array.dat에 저장한 후 다시 읽어
// 합계와 평균을 구하고 정렬하여 콘솔에 출력하세요
public class Prob14 {
    public static void main(String[] args) throws Exception {

        // 1. 정수 배열 => 저장 파일의 이름 지정
        // 2. 배열을 파일에 저장 로직구현
        // 3. 저장한 파일에서 배열 읽기 로직 구현
        // 4. 배열에서 갑을 요소를 모두 더하여 합계, 평균 구하기

        int[] array = {5, 10, 15, 20};
        int sum = 0;
        double avg;

        FileOutputStream fos = new FileOutputStream("array.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(array.length);

        for (int i = 0; i < array.length; i++) {
            dos.writeInt(array[i]);
        }

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("data.dat");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt(); //배열 길이 읽기
        int[] readArray = new int[length];

        for (int i = 0; i < length; i++) {
            readArray[i] = dis.readInt();
            sum += readArray[i];
        }
        dis.close();
        fis.close();

        avg = (double) sum / length;

        System.out.println("합 : "+sum);
        System.out.println("평균 : "+avg);
    }
}
