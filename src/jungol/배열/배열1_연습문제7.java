package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
//        int[] arrayEven = new int[5];
        int temp = 0;
        int temp2 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
//        for (int i = 0; i < arrayEven.length; i++) {
//            array[i] = sc.nextInt();
//        }

        temp = array[0];    //임시 변수 초기값 인덱스 0번

        for (int i = 0; i < 8; i++) {
            if (array[i + 1] % 2 == 0) {
                // 1번 2번 비교후 큰것 템프에 넣음
                if (temp < array[i + 1]) {
                    temp = array[i + 1];
                }
            }
        }
        temp2 = array[0];    //임시 변수 초기값 인덱스 0번

        for (int i = 0; i < 8; i++) {
            if (array[i + 1] % 2 != 0) {
                // 1번 2번 비교후 큰것 템프에 넣음
                if (temp2 > array[i + 1]) {
                    temp2 = array[i + 1];
                }
            }
        }
        System.out.print(temp2 + " " + temp);
    }
}
