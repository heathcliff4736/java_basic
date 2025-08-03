package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_형성평가4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int arrayLength = sc.nextInt();
        sc.nextLine();

        if (arrayLength < 1 || arrayLength > 10) {
            System.out.println("1 이상 10 이하의 정수를 입력하세요.");
            return;
        }

        String[] arrayStr = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arrayStr[i] = sc.nextLine();
        }
        Arrays.sort(arrayStr);
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(arrayStr[i]);
        }
    }
}
