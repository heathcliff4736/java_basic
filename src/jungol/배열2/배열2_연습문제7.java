package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            array[i][0] = 1;
            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
//                System.out.print(array[i][j]+" ");
            }
//            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
