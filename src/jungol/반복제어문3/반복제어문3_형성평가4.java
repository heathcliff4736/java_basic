package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n * 2; j > i * 2 - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 3; j < i * 2 + 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
