package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 3;

        char ch = 'A';
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i-1; j--) {
                System.out.print(ch + " ");
                ch++;
            }
            for (int j = n-1; j > n-i; j--) {
                System.out.print(temp + " ");
                temp += 1;
            }
            System.out.println();
        }
    }
}
