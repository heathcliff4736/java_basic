package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String[] stringArray = new String[5];
        for (int i = 0; i < 5; i++) {
            stringArray[i] = in.nextLine();
            System.out.println(stringArray[i]);
        }
    }
}
