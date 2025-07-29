package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int n = 5;
        int temp = 0;

        for (int i = 1; i <= n; i++) {       // 1 2 3 4 5
            for (int j = 1+temp; j <= i+temp; j++) {    // 1 / 23 / 456 /78910
                System.out.print(j+" ");
            }
            temp += i;
//            System.out.printf("(%d, %d)", i, j);
            System.out.println();
        }

    }
}
