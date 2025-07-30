package jungol.배열;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class 배열1_연습문제7_api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] outputArray = new Integer[10];

        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = sc.nextInt();
        }

        //입력받은 수를 검사해서 짝수인지 홀수인지를 판단하여 따로따로 저장관리하자

        Arrays.sort(outputArray);

        int maxIndex = 9;
        int minIndex = 0;

        int maxEven = outputArray[maxIndex];
        int minOdd = outputArray[minIndex];

        while (abs(maxEven) % 2 != 0) {
            maxIndex--;
            maxEven = outputArray[maxIndex];
        }

        while (abs(minOdd) % 2 == 0) {
            minIndex++;
            minOdd = outputArray[minIndex];
        }

        System.out.printf("%d %d ", minOdd, maxEven);


    }
}
