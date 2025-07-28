package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num1; i++){
            int num2 = sc.nextInt();
            sum += num2;
        }
        double avg = sum/(double)num1;
        System.out.printf("%.2f", avg);
    }
}
