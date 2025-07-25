package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // 1 3 5 7 8 10 12 >> 31
        // 4 6 9 11 >> 30
        // 2 >> 28

        if (n<=7 && n%2!=0) {
            System.out.println(31);
        } else if (n==2) {
            System.out.println(28);
        } else if (n>=8 && n%2==0) {
            System.out.println(31);
        } else {
            System.out.println(30);
        }
    }
}
