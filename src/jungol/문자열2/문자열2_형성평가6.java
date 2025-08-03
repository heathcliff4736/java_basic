package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String a = sc.next();
        String b = sc.next();
        int n = sc.nextInt();

        a = a+b;

        String newA = a.length() >= n ? a.substring(0, n) : a;
        String newB = b.length() >= n ? b.substring(n) : "";

        String resultB = newA + newB;

        System.out.println(a);
        System.out.println(resultB);
    }
}
