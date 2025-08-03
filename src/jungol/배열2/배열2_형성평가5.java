package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] scores = new int[4][3];
        int[] sum = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "class? ");
            for (int j = 0; j < 3; j++) {
                scores[i][j] = sc.nextInt();
                sum[i] += scores[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "class : " + sum[i]);
        }
    }
}
