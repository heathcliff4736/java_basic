package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] outputArray = new Integer[5];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = sc.nextInt();
        }
        System.out.print(outputArray[0]+outputArray[2]+outputArray[4]);
    }
}
