package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][0] = 1; //
            for (int j = 1; j <= i; j++) {
                array[i][j] = array[i-1][j-1] + array[i-1][j];
            }
        }

        // 역순
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
