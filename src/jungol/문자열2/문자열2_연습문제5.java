package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String input = in.next();
        String input2 = in.next();
        if(input.length()>10 || input2.length()>10) System.out.println("10자 이하의 문자열을 입력해주세요. ");

//        System.out.println(input.length()+" "+ input2.length());

        System.out.print(input2+input);
    }
}
