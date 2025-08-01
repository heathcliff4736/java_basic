package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String str = in.next();
        System.out.println("입력받은 문자열의 길이는 "+str.length()+"입니다.\n");
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}