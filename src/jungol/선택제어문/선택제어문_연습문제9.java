package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제9 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int res = (num1 > num2) ? num1 : num2;

        System.out.println(res);


    }
}
