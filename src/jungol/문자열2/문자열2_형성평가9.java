package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num = sc.nextInt();
        double num2 = sc.nextDouble();
        String str = sc.next();

        String newDouble = String.format("%.3f", num2);

        String output = num + newDouble + str;

        int outputlength = output.length();
        int midNumber = (outputlength + 1) / 2;

        System.out.println(output.substring(0, midNumber));
        System.out.println(output.substring(midNumber));
    }
}
