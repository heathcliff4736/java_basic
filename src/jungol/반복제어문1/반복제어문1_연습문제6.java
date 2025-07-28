package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bool1 = true;

        while (bool1) {
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");

            int num1 = sc.nextInt();
            System.out.println();
            switch (num1) {
                case 1:
                    System.out.println("입력하기를 선택하였습니다.\n");
                    break;
                case 2:
                    System.out.println("출력하기를 선택하였습니다.\n");
                    break;
                case 3:
                    System.out.println("삭제하기를 선택하였습니다.\n");
                    break;
                case 4:
                    System.out.println("끝내기를 선택하였습니다.\n");
                    bool1 = false;
                    break;
                default:
                    System.out.println("잘못 입력하였습니다. \n");
                    break;
            }
        }
    }
}