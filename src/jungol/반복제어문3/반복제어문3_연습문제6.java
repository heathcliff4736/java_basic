package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 3;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("@");
            }
//            for (int j=n; j<=i+n; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
        }
        for (int i=n-1; i>0; i--){
            for (int j=1; j<=i; j++) {
                System.out.print("@");
            }

            System.out.println();
        }

/*        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--) {
                System.out.print(" ");
            }
            for (int j=1; j<i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
