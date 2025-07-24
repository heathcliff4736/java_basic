package jungol;

import java.util.Scanner;

public class 선택제어문_연습문제5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.printf("주사위를 두 번 던진 결과를 입력하세요. ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1 >= 4 && num2 >= 4){
            System.out.printf("이겼습니다.");
        } else if (num1 >= 4 || num2 >= 4) {
            System.out.printf("비겼습니다.");
        } else {
            System.out.printf("졌습니다.");
        }

    }
}
