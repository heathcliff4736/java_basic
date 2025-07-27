package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int sum = n1+n2+n3+n4;
        int avg = (n1+n2+n3+n4)/4;

        System.out.printf("sum %d\n", sum);
        System.out.printf("avg %d\n", avg);

    }
}
