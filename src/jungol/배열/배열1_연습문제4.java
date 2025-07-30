package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;
        int i = 0;
        int[] array = new int[100];
//        int size = array.length;

        do {
            inputNum = sc.nextInt();
            array[i] = inputNum;
            i++;
        } while (inputNum != 0);
        int size = i;

        for(i=1; i<size-1; i+=2){
            System.out.print(array[i]+" ");
        }

    }
}
