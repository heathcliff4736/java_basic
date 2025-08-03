package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = new int[4][2];
        int[] rowSum = new int[4];
        int[] colSum = new int[2];
        int totalSum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                rowSum[i] += arr[i][j];
                colSum[j] += arr[i][j];
                totalSum += arr[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(rowSum[i] / 2 + " ");
        }
        System.out.println();

        for (int j = 0; j < 2; j++) {
            System.out.print(colSum[j] / 4 + " ");
        }
        System.out.println();

        System.out.println(totalSum / 8);
    }
}
