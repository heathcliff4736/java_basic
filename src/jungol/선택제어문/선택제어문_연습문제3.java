package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.printf("점수를 입력하세요. ");

        int num1 = in.nextInt();
        //int num2 = in.nextInt();

        //System.out.print("\n");

        if (num1 >= 80){
            //System.out.printf("입력받은 수 중 큰 수는 %s이고 작은 수는 %s입니다. ", num1 , num2);
            System.out.printf("축하합니다. 합격입니다.");
        } else {
            //System.out.printf("입력받은 수 중 큰 수는 %s이고 작은 수는 %s입니다. ", num2 , num1);
            System.out.printf("죄송합니다. 불합격입니다.");
        }
    }
}
