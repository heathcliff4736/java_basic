package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg;

        while (true) {
            int num1 = sc.nextInt();
            if (num1 == 0) {
                break;
            } else {
                count++;
                sum += num1;
            }
        }
        avg = (double) sum / count;
        System.out.printf("입력된 자료의 개수 = %d\n", count);
        System.out.printf("입력된 자료의 합계 = %d\n", sum);
        System.out.printf("입력된 자료의 평균 = %.2f\n", avg);
    }
}