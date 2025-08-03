package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] arrayStr = new String[5];


        for (int i = 0; i < 5; i++) {
            arrayStr[i] = sc.nextLine();
        }

        String findChar = sc.nextLine();
        String findStr = sc.nextLine();
        int count = 0;
        for (int i = 0; i < arrayStr.length; i++) {
            String word = arrayStr[i];

            if (word.contains(findChar) || word.contains(findStr)) {
                System.out.println(word);
                count++;
            }

        }
        if (count == 0) System.out.println("none");
    }
}
