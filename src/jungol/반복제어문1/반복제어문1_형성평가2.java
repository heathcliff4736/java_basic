package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_형성평가2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int oddCount = 0;
        int evenCount = 0;

        while (true){
            int n = sc.nextInt();
            if(n==0) break;
            else if(n%2==0) evenCount++;
            else oddCount++;
        }
        System.out.printf("odd : %d\n", oddCount);
        System.out.printf("even : %d", evenCount);
    }
}