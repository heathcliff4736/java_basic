package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_연습문제6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i=0; i<5; i++){
            int num1 = sc.nextInt();
            sum += num1;
        }
        double avg = sum/5d;
        System.out.printf("총점 : %d\n",sum);
        System.out.printf("평균 : %.1f", avg);

    }
}
