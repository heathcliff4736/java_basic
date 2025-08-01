package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            String inputStr = in.next();
            char ch = inputStr.charAt(0);
            int i = ch;
            System.out.printf("%c -> %d\n", ch, i);
            if (ch == '0') {
                break;
            }

        }
    }
}