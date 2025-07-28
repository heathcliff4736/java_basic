package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg;

        while (true) {
            int num1 = sc.nextInt();
            if (num1 == 0) {
                break;
            } else if(num1%2!=0) {
                count++;
                sum += num1;
            }
        }
        avg = (double) sum / count;
//        System.out.printf("입력된 자료의 개수 = %d\n", count);
        System.out.printf("홀수의 합 = %d\n", sum);
        System.out.printf("홀수의 평균 = %.0f\n", Math.floor(avg));
    }
}