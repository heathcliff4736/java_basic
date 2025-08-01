package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String input = in.next();
        String input2 = in.next();
        if(input.length()>49 || input2.length()>49) System.out.println("49자 이하의 문장을 입력해주세요. ");

//        System.out.println(input.length()+" "+ input2.length());

        if(input.length()< input2.length()) System.out.print(input+"\n"+input2);
        else System.out.print(input2+"\n"+input);


    }
}
