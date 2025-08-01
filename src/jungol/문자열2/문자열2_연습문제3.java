package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String[] arrayStr = new String[]{"champion", "class"};

        System.out.print("문자를 입력하세요. ");
        String inputStr = in.nextLine();


        for (int i = 0; i < arrayStr.length; i++) {
            String temp = arrayStr[i];
            int index = temp.indexOf(inputStr);
            if(index==0) System.out.println(temp);
        }
    }
}
