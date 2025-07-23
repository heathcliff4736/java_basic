package jungol;

import java.util.Scanner;

public class 선택제어문_연습문제1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.printf("%s\n", num1);

        if (num1 > 10){
            System.out.printf("10보다 큰 수를 입력하셨습니다.");
        } else {
            System.out.printf("10이하의 수를 입력하셨습니다.");
        }
    }
}
