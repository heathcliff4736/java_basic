package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Double num1 = in.nextDouble();
        Double num2 = in.nextDouble();

        if (num1 >= 4 && num2 >= 4){
            System.out.printf("A");
        } else if (num1 >= 3 && num2 >= 3) {
            System.out.printf("B");
        } else {
            System.out.printf("C");
        }

    }
}
