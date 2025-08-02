package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = null;

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
