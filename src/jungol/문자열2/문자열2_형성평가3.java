package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] arrayStr = new String[50];
        int i = 0;

        while(true) {
            String str = sc.nextLine();
            if (str.equals("0")) break;
            else {
                arrayStr[i] = str;
                i++;
            }
        }
        System.out.println(i);
        for (int j = 0; j < i; j+=2) {
            System.out.println(arrayStr[j]);
        }
    }
}
