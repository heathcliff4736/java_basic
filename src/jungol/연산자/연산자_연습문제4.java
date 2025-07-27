package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int c = ++a + b--;

        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
