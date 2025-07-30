package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int temp;

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        for(int i=0; i<4; i++){
            temp = array[i];    //임시 변수 초기값 인덱스 0번
            // 1번 2번 비교후 큰것 템프에 넣음
            if (temp < array[i+1]){
                array[i] = temp;
                temp = array[i+1];
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
