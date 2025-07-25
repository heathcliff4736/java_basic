package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        //System.out.printf("점수를 입력하세요. ");

        int num1 = in.nextInt();
        int num2 = 20 - num1;

        if (num1 >= 20){
            System.out.printf("adult");
        } else {
            System.out.printf("%s years later", num2);
        }
    }
}
