package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;
        int i = 0;
        int[] Array = new int[100];
//        int size = Array.length;

        do {
            inputNum = sc.nextInt();
            Array[i] = inputNum;
            i++;
        } while (inputNum != 0);
        int size = i;

        for(i=1; i<size-1; i+=2){
            System.out.print(Array[i]+" ");
        }

    }
}
