package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "jungol olympiad";

        for (int i = 0; i < 5; i++) {
            int num = in.nextInt();
//            System.out.print(s.substring(num, num+1));
            System.out.print(s.charAt(num));

        }
    }
}