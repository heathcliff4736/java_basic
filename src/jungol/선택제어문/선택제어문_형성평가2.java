package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
//        int num2 = in.nextInt();


        if (num1 >0) {
            System.out.println("plus");
        } else if (num1==0){
            System.out.println("zero");
        } else {
            System.out.println("minus");
        }

    }
}
