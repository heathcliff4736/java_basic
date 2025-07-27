package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int num1 = a / b;
        int num2 = a % b;

        System.out.printf("%d / %d = %d...%d\n", a, b, num1, num2);

    }
}
