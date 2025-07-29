package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 3;
        int x;
        int temp = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (x = temp; x < n+temp-i; x++) {
                System.out.print(x + " ");
            }
            temp = x;
//            System.out.printf("(%d, %d)", temp, x);
            System.out.println();
        }
    }
}
