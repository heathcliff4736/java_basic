package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.printf("세 수를 입력하세요. ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", num2);
        } else {
            System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", num3);
        }
    }
}
