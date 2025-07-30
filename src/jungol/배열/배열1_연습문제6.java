package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int temp = 0;

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        for(int i=0; i<8; i++){
            temp = array[0];    //임시 변수 초기값 인덱스 0번
            // 1번 2번 비교후 큰것 템프에 넣음
            if (temp < array[i+1]) temp = array[i+1];
//            System.out.print(temp+" ");
        }
        System.out.print(temp);
    }
}
