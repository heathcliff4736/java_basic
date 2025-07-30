package jungol.배열;

import java.util.Scanner;

public class 배열1_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = new char[10];

        for (int i = 0; i < array.length; i++) {
            String s = sc.next();
            char a = s.charAt(0);
            array[i] = a;
            System.out.print(array[i]);
        }
    }
}
