package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int res = 0;

        if (num1 >= num2) {
            res = num1 - num2;
        } else {
            res = num2 - num1;
        }



        System.out.println(res);

    }
}
