package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        for(int i=1; i<=num1; i++){
            for(int j=1; j<=num1; j++){
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }
    }
}
