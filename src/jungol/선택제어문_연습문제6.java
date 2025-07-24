package jungol;

import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

//        System.out.printf("세 수를 입력하세요. ");

        String gender = in.next();
        int num1 = in.nextInt();
        //int num3 = in.nextInt();

        if (gender.equals("M") && num1 > 17 ){
            System.out.printf("MAN");
        } else if (gender.equals("F") && num1 > 17 ){
            System.out.printf("WOMAN");
        } else if (gender.equals("F") && num1 <= 17 ){
            System.out.printf("GIRL");
        } else {
            System.out.printf("BOY");
        }
    }
}
