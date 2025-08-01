package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String input = "";
        input = in.nextLine();
        if(input.length()>49) System.out.println("49자 이하의 문장을 입력해주세요. ");

        String[] inputStr = input.split(" ");
        for (int i = 0; i < inputStr.length; i++) {

            System.out.println(inputStr[i]);

        }

    }
}
