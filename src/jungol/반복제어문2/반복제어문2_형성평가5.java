package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        for (int i = 0; i < 10; i++){
            int num1 = sc.nextInt();
            if(num1%2==0) even += 1;
            else odd += 1;
        }
        System.out.printf("even : %d\n", even);
        System.out.printf("odd : %d\n", odd);
    }
}
