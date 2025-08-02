package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String input = in.next();
        String input2 = in.next();
        if (input.length() > 20 || input2.length() > 20) System.out.println("20자 이하의 문자열을 입력해주세요. ");

        StringBuffer sb1 = new StringBuffer(input);
        StringBuffer sb2 = new StringBuffer(input2);
        String temp = input.substring(0,3);
        String temp2 = input2.substring(0,3);
        sb1 = sb1.delete(0,3);

//        System.out.println(sb1);
        System.out.println(sb1.insert(0,temp2));
//        System.out.println(sb2);
        System.out.println(sb2.append(temp));

    }
}
