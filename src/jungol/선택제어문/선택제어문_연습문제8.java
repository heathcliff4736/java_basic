package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제8 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("점수를 입력하세요. ");

        int scr = in.nextInt();
        int res = scr/10;

        switch (res) {
            case 9 :
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.print("F");
                break;
        }
    }
}
