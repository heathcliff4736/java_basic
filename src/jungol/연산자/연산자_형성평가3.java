package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int width = in.nextInt();
        int length = in.nextInt();

        width = width + 5;
        length = length * 2;

        System.out.printf("width = %d\n", width);
        System.out.printf("length = %d\n", length);
        System.out.printf("area = %d\n", width*length);
    }
}
