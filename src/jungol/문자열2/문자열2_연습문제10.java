package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_연습문제10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int inputInt1 = sc.nextInt();
        int inputInt2 = sc.nextInt();
        System.out.printf("%d + %d = %d\n", inputInt1, inputInt2, inputInt1+inputInt2);
        double inputDouble1 = sc.nextDouble();
        double inputDouble2 = sc.nextDouble();
        System.out.printf("%.2f + %.2f = %.2f", inputDouble1, inputDouble2, inputDouble1+inputDouble2);

    }
}
