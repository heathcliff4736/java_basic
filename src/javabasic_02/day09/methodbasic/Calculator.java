package javabasic_02.day09.methodbasic;

import java.util.Scanner;

public class Calculator {
    static Scanner in = new Scanner(System.in);

    public static void Calculator() {

        boolean bool1 = true;
        while (bool1) {
            System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해주세요.");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int menuNumber = in.nextInt();
            switch (menuNumber) {
                case 1:
                    System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
                    System.out.println("=================================");
                    break;
                case 2:
                    System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
                    System.out.println("=================================");
                    break;
                case 3:
                    System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
                    System.out.println("=================================");
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("0으로 나눌수 없습니다.");
                        break;
                    } else {
                        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
                        System.out.println("=================================");
                        break;
                    }
                case 5:
                    System.out.print("종료를 선택하셨습니다. 프로그램을 종료합니다. \n");
                    bool1 = false;
                default:
                    System.out.println("잘못된 메뉴를 입력하셨습니다.");
            }
        }
    }

    public static void print() {
        System.out.println("================================================");
        System.out.println("                 사칙연산 계산기");
        System.out.println("================================================");
        System.out.println("1. 덧셈  2. 뺄셈  3. 곱셈  4. 나눗셈  5. 프로그램 종료");
    }

    public static void main(String[] args) {
        print();
        Calculator();
    }
}
