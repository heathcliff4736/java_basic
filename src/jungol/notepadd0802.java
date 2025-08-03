package jungol;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class notepadd0802 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 정수 입력
        int n = sc.nextInt();
        sc.nextLine(); // 줄바꿈 제거

        // 입력값 유효성 체크
        if (n < 1 || n > 10) {
            System.out.println("1 이상 10 이하의 정수를 입력하세요.");
            return;
        }

        // 문자열 배열 선언
        String[] arrayStr = new String[n];

        // 문자열 입력
        for (int i = 0; i < n; i++) {
            arrayStr[i] = sc.nextLine();
        }

        // 아스키코드 기준 정렬
        Arrays.sort(arrayStr);

        // 정렬된 결과 출력
        for (String str : arrayStr) {
            System.out.println(str);
        }

        sc.close();
    }
}
