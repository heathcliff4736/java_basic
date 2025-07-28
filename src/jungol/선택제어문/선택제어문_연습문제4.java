package jungol.선택제어문;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_연습문제4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {


            System.out.printf("점수를 입력하세요. ");

            int num1 = in.nextInt();
            String grd = "";

            if ((num1 >= 90) && (num1 <= 100)) {
                grd = "A";
            } else if ((num1 >= 80) && (num1 < 90)) {
                grd = "B";
            } else if ((num1 >= 70) && (num1 < 80)) {
                grd = "C";
            } else if ((num1 >= 60) && (num1 < 70)) {
                grd = "D";
            } else {
                grd = "E";
            }
            System.out.printf("%s", grd);
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력이 가능합니다.");
        }
    }
}
