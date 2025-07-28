package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        if (num1 > num2) {
            for (int i = 1; i <= 9; i++) {
                for (int j = num1; j >= num2; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, i*j);
                }
                System.out.println();
            }
            System.out.println();
        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = num1; j <= num2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, i*j);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
