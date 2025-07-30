package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

//        for (int i : array) {
//            System.out.print(i);
//        }

    }
}
