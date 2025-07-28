package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String a = "*";

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.printf("%5s\n", a);
            }
            System.out.println();
        }

    }
}
