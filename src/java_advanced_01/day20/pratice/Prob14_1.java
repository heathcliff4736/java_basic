package java_advanced_01.day20.pratice;

import java.io.*;
import java.util.Arrays;

//문제 : 정수 배열 {5,10,15,20}를 array.dat에 저장한 후 다시 읽어
// 합계와 평균을 구하고 정렬하여 콘솔에 출력하세요
public class Prob14_1 {
    public static void main(String[] args) {

        // 1. 정수 배열 => 저장 파일의 이름 지정



        int[] array = {5, 10, 15, 20};
        String fileNm = "data.dat";

        // 2. 배열을 파일에 저장 로직구현
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileNm))){
            dos.writeInt(array.length); // 배열의 길이 먼저 저장
            for (int num : array) {
                dos.writeInt(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. 저장한 파일에서 배열 읽기 로직 구현
        int[] readArray = null;
        try(DataInputStream dis = new DataInputStream(new FileInputStream(fileNm))){
            int len = dis.readInt();
            readArray = new int[len];
            for (int i = 0; i < len; i++) {
                readArray[i] = dis.readInt();
            }
        } catch (Exception e){

        }

        // 4. 배열에서 갑을 요소를 모두 더하여 합계, 평균 구하기

        if(readArray != null){
            int sum = 0;
            for (int num : readArray) sum += num;
            double avg = sum / readArray.length;
            System.out.println("읽어온 배열 " + Arrays.toString(readArray));
            System.out.println("합계: "+sum);
            System.out.println("평균: "+avg);

        }

    }
}
