package jungol;

import java.util.Scanner;

public class notepadd0729 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 3;
        int x;
        int temp = 1;
        int j;

        for (int i = 0; i < n; i++) {
            for (j = temp; j <= temp+n+1; j+=2) {
//                if(j%10) System.out.print(j + " ");
//                else System.out.print(j+" ");
                System.out.print(j%10+" ");
            }
            temp = j;
            System.out.println();
        }
    }
}
