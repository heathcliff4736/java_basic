package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "우리나라 대한민국!";

        System.out.println(str);
        System.out.println("위 문자열의 길이는 "+str.length()+"입니다.\n");
        /*for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }*/
    }
}