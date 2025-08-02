package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String input1 = in.next();
        String input2 = in.next();

        if (input1.compareTo(input2) > 0)
            System.out.println(input1 + " 가(이) 더 큽니다.");
        else
            System.out.println(input2 + " 가(이) 더 큽니다.");
//        System.out.println(input1.compareTo(input2));
//        System.out.println(input1.substring(0, 3));
//        System.out.println(input2.substring(0, 3));

        if (input1.substring(0, 3).equals(input2.substring(0, 3)))
            System.out.println("앞의 세 문자가 같습니다.");
        else
            System.out.printf("앞의 세 문자가 같지 않습니다.");

    }
}
