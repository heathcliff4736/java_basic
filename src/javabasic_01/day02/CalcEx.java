package javabasic_01.day02;

import java.util.Scanner;

public class CalcEx {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        int min = a - b;
        int mul = a * b;
        double div = (double) a /b;

        System.out.printf("%d+%d=%d\n", a, b, sum);
        System.out.printf("%d-%d=%d\n", a, b, min);
        System.out.printf("%d*%d=%d\n", a, b, mul);
        System.out.printf("%d/%d=%f\n", a, b, div);
    }
}
