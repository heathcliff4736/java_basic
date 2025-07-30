package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int size = num.length;

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        System.out.print(num[2]+" ");
        System.out.print(num[4]+" ");
        System.out.print(num[9]+" ");

    }
}
