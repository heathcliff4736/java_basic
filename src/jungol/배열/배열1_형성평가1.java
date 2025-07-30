package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] outputArray = new char[10];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = sc.next().charAt(0);
//            System.out.print(outputArray[i]+" ");
        }

        for (int i = outputArray.length-1; i >= 0 ; i--) {
            System.out.print(outputArray[i]+" ");
        }
    }
}
