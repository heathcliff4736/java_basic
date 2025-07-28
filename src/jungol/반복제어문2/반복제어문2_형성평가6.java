package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp1, temp2;
        int sum = 0;
        int count = 0;

        if (num1 > num2) {
            temp1 = num1;
            temp2 = num2;
        } else {
            temp2 = num1;
            temp1 = num2;
        }

        for (int i = temp2; i <= temp1; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            } else if (i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        double avg = (double)sum/count;
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f\n", avg);
    }
}
