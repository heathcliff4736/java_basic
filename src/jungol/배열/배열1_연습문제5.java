package jungol.배열;

import java.util.Calendar;
import java.util.Scanner;

public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calendar cal = Calendar.getInstance();

        int scMonth;

        while (true) {
            System.out.print("YEAR = ");
            int scYear = sc.nextInt();
            System.out.print("MONTH = ");
            scMonth = sc.nextInt();
            cal.set(scYear, scMonth - 1, 1);
            if (scMonth > 12) System.out.println("잘못 입력하였습니다. \n");
            else if (scMonth<1) break;
            else System.out.println("입력하신 달의 날 수는 " + cal.getActualMaximum(Calendar.DAY_OF_MONTH) + "일입니다. \n");
        }

    }
}
