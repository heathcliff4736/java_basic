package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int res = num2 + 100 - num1;

        if (res > 0){

            //System.out.printf("입력받은 수 중 큰 수는 %s이고 작은 수는 %s입니다. ", num1 , num2);
            System.out.printf("%s\nObesity", res);
        } else {
            System.out.printf("%s", res);
        }
    }
}
