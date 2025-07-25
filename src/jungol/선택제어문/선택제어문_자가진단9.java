package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단9 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int res2 = (num1 > num2) ? num1 : num2;
        int res = num1 > num2 ? num1 : (num2 > num3) ? num2 : num3;

        System.out.println(res2);
        System.out.println(res);

    }
}
