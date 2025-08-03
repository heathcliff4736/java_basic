package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] output = {10, 20, 30, 40};
        int[] numbers = new int[40];
        numbers[0] = 1;
        numbers[1] = 1;

        int a = 1;
        int b = 1;
        int num = 0;

        for (int i = 3; i < 41; i++) {
            num = a + b;
            numbers[i-1] = num;
            a = b;
            b = num;
        }

        for (int i = 0; i < output.length; i++) {
            int n = output[i];
            System.out.println("피보나치 수열 " + n + "항 : " + numbers[n - 1]);
        }
    }
}
