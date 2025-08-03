package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] arrayStr = {"flower", "rose", "lily", "daffodil", "azalea"};
        int count = 0;
        String str = sc.next();

        for (int i = 0; i < arrayStr.length; i++) {
            String newStr = arrayStr[i].substring(1, arrayStr[i].length());
            int index = newStr.indexOf(str);
//            System.out.println(index);
            if (index == 0 || index == 1) {
                System.out.println(arrayStr[i]);
                count++;
            }
        }
        if (count == 0) System.out.println(0);
        else System.out.println(count);
    }
}
