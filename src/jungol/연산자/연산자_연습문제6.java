package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.printf("%d %d %d %d\n",
                (a > b ? 1 : 0),
                (b >= c ? 1 : 0),
                (a <= b ? 1 : 0),
                (b < c ? 1 : 0));
    }
}

