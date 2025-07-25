package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단8 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double scr = in.nextDouble();

        switch ((int) scr) {
            case 4 :
                System.out.println("scholarship");
                break;
            case 3:
                System.out.println("next semester");
                break;
            case 2:
                System.out.println("seasonal semester");
                break;
            default:
                System.out.print("retake");
                break;
        }
    }
}
