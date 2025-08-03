package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = extractLeadingInteger(str1);
        int num2 = extractLeadingInteger(str2);

        System.out.println(num1 * num2);
        
    }

    // 앞부분의 숫자만 추출하는 메서드
    private static int extractLeadingInteger(String str) {
        StringBuffer sb = new StringBuffer();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                break; // 숫자가 아닌 문자가 나오면 중단
            }
        }

        if (sb.length() == 0) return 0;
        return Integer.parseInt(sb.toString());
    }
}
