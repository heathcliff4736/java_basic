package jungol.배열;

import java.util.Calendar;
import java.util.Scanner;

public class 배열1_연습문제5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 각 월별 기본 일 수 저장 (2월은 일단 28일로 설정)
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        while (true) {
            System.out.print("YEAR = ");
            int year = scanner.nextInt();

            System.out.print("MONTH = ");
            int month = scanner.nextInt();

            if (month == 0) {
                break; // 종료
            }

            // 월이 잘못 입력된 경우
            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하였습니다.\n");
                continue;
            }

            int days = daysInMonth[month - 1];

            // 윤년인 경우 2월을 29일로 처리
            if (month == 2 && isLeapYear(year)) {
                days = 29;
            }

            System.out.println("입력하신 달의 날 수는 " + days + "일입니다.\n");
        }

        scanner.close();
    }

    // 윤년 판별 메서드
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
