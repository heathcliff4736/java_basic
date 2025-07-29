package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        int avg;
        while (true) {
            int n = sc.nextInt();
            i++;
            sum+=n;
            if (n == 0){
                i--;
                break;
            }
            else if (i>=20) break;

        }
        avg = sum/i;
        System.out.printf("%d %d",sum, avg);
//        System.out.print("\n"+ i);
    }
}
