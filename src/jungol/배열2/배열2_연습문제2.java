package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[10];

        while(true){
            int numbers = sc.nextInt();
            if (numbers == 0) break;
            else if (numbers != 0) count[numbers % 10]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0) System.out.println(i + " : " + count[i] + "개");
        }
    }
}
