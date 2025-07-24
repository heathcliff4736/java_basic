package jungol;

import java.util.Scanner;

public class 선택제어문_연습문제4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.printf("점수를 입력하세요. ");

        int num1 = in.nextInt();
        String grd = "";

        if (num1 >= 90){
            grd = "A";
        } else if (num1 >= 80){
            grd = "B";
        } else if (num1 >= 70){
            grd = "C";
        } else if (num1 >= 60){
            grd = "D";
        } else {
            grd = "E";
        }
        System.out.printf("%s", grd);
    }
}
