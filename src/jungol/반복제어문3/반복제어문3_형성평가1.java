package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (true) {
            sum+=i;
            if (sum>n) break;
            i++;
        }
        System.out.printf("%d %d", i, sum);
    }
}
