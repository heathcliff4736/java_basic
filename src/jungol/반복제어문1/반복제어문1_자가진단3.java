package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("number? ");
            int n = sc.nextInt();
            if (n == 0) { break; }
            else if (n>0) { System.out.print("positive integer\n"); }
            else { System.out.print("negative number\n"); }
        }
    }
}
//한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지
// 출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.
//
//* 입출력예의 진한글씨는 출력값입니다.