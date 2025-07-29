package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();

        for (int i = sc1; i < 100; i += sc1) {
            System.out.print(i + " ");
            if (i % 10 == 0) break;
        }

    }
}
