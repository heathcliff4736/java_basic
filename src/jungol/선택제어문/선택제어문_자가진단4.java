package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Double num1 = in.nextDouble();
        String grd = "";

        if (num1 <= 50.80){
            grd = "Flyweight";
        } else if (num1 <= 61.23){
            grd = "Lightweight";
        } else if (num1 <= 72.57){
            grd = "Middleweight";
        } else if (num1 <= 88.45){
            grd = "Cruiserweight";
        } else {
            grd = "Heavyweight";
        }
        System.out.printf("%s", grd);
    }
}
