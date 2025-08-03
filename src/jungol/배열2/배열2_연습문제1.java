package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];

        while (true) {
            int n = sc.nextInt();
            if (n < 1 || n > 10) break;

            arrayInt[n - 1]++;
        }

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i]>0) System.out.print(i+1+" : "+arrayInt[i] + "개\n");
        }
    }
}
