package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("두 개의 실수를 입력하시오.\n");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.printf("x = %.2f\n", num1);
        System.out.printf("y = %.2f\n", num2);

    }
}
