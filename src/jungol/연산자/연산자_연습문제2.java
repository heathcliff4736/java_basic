package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("5개의 수를 입력하시오. ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();

        System.out.printf("%d ", n1+3);
        System.out.printf("%d ", n2-3);
        System.out.printf("%d ", n3*3);
        System.out.printf("%d ", n4/3);
        System.out.printf("%d", n5%3);

    }
}
