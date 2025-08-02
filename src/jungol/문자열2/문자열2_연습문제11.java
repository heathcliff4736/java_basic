package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 3; i++) {
            double num = sc.nextDouble();
            String str = String.format("%.2f", num);
            sb.append(str);
        }

        String[] arrayString = sb.toString().split("\\.");
        for (String newStr : arrayString) {
            System.out.println(newStr);
        }
    }
}
