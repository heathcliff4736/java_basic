package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 4;
        int temp = 1;
        int j;

        for (int i = 0; i < n; i++) {
            for (j = temp; j <= temp+n*2-1; j+=2) {
                System.out.print(j%10+" ");
            }
            temp = j;
            System.out.println();
        }
    }
}
