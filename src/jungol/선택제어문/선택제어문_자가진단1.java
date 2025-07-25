package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.printf("%s\n", num1);

        if (num1 < 0){
            System.out.println("minus");
        } else {
            System.out.println();
        }
    }
}
