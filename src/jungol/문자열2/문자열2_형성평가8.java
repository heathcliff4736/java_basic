package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            String str = sc.next();

            if (str.equals("END")) {
                break;
            }

            StringBuffer reversed = new StringBuffer(str).reverse();
            System.out.println(reversed);
        }
    }
}
