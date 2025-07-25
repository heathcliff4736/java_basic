package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n % 4 == 0 ) {
            if (n % 100 == 0 ) {
                if (n % 400 == 0){
                    System.out.println("leap year");
                } else {
                    System.out.println("common year");
                }
            } else{
                System.out.println("leap year");
            }
        } else {
            System.out.println("common year");
        }

/*        정답
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("common year");
        }*/

    }
}
