package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 3;

        for (int i=1; i<=n; i++){
            for (int j=n*2; j>i*2; j--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
