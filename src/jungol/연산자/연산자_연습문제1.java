package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("두 개의 수를 입력하시오. ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
        System.out.printf("%d - %d = %d\n", n1, n2, n1-n2);
        System.out.printf("%d * %d = %d\n", n1, n2, n1*n2);
        System.out.printf("%d // %d = %d\n", n1, n2, n1/n2);
//        System.out.printf(n1 + " %% " + n2 + " = " + n1 % n2);
        System.out.printf("%d %% %d = %d\n", n1, n2, n1%n2);
//        System.out.printf("%d ** %d = %.0f\n", n1, n2, Math.pow(n1, n2));


//        System.out.print(n1%n2);

    }
}
