package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] sum = new int[3][3];

        // 입력
        for (int i = 0; i < 3; i++) {
            System.out.print("첫 번째 배열 "+(i+1)+"행 ");
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("두 번째 배열 "+(i+1)+"행 ");
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 합
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        // 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
