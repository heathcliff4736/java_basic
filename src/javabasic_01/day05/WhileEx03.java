package javabasic_01.day05;

import java.util.Scanner;

public class WhileEx03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean run = true;

        int speed = 0;

        while(run){
            System.out.println("--------------------------------");
            System.out.println("1. 증가   |  2. 감소   |  3. 종료 ");
            System.out.println("--------------------------------");
            System.out.print("선택하세요. ");

            String stringNum = in.nextLine();
            
            if (stringNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (stringNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (stringNum.equals("3")) {
                run = false;
                System.out.println("엔진 끄기");
            }

        }
        System.out.println("프로그램 종료");
    }
}
