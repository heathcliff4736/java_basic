package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String arrayString[] = {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};
        int count = 0;

        System.out.print("문자를 입력하세요. ");
        String input = in.nextLine();
        for (int i = 0; i < arrayString.length; i++) {
            int index = arrayString[i].indexOf(input);
            if (index != -1) {
                System.out.println(arrayString[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("찾는 단어가 없습니다. \n");
        }
        count = 0;
        System.out.println();
        System.out.print("문자열을 입력하세요. ");
        String inputString = in.nextLine();
        for (int i = 0; i < arrayString.length; i++) {
            int index = arrayString[i].indexOf(inputString);
            if (index != -1) {
                System.out.println(arrayString[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("찾는 단어가 없습니다. \n");
        }
    }
}
