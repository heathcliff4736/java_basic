package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[6];

        for (int i = 0; i < 10; i++) {
//            int dice = (int) (Math.random() * 6 + 1);
            int dice = sc.nextInt();
            count[dice-1]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println((i+1) + " : " + count[i]);
        }
    }
}
