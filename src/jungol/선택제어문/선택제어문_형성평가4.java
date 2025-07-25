package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Number? ");

        int n = in.nextInt();

        if (n==1) {
            System.out.println("dog");
        } else if (n==2) {
            System.out.println("cat");
        } else if (n==3) {
            System.out.println("chick");
        } else {
            System.out.println("I don't know.");
        }
    }
}
