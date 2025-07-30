package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOdd = 0;
        int sumEven = 0;

        Integer[] outputArray = new Integer[10];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = sc.nextInt();
        }
        for (int i = 0; i < outputArray.length; i+=2) {
            sumOdd +=outputArray[i];
        }
        for (int i = 1; i < outputArray.length; i+=2) {
            sumEven +=outputArray[i];
        }
        System.out.print("odd : " + sumOdd+"\n");
        System.out.print("even : " + sumEven);

    }
}
