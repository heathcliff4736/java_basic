package day05;

import java.util.Scanner;

public class StarEx99 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 4;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            for (int j=n; j>i; j--) {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
