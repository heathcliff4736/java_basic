package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제7_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch = 'a';
        int temp = 0;
        int temp2 = 1;
        int x;

        for (int i = 1; i <= n; i++) {
            for (int j = 1 + temp; j <= i + temp; j++) {
                System.out.printf("%3c ", ch);
                ch++;
            }
            temp += i;
            for (x = temp2; x <= temp2-i+n; x++) {
                System.out.printf("%3d",x);
            }
            temp2 = x;
            System.out.println();
        }
    }
}
