package javabasic_02.day09.methods;

import java.util.Scanner;

public class Example06 {
    static Scanner in = new Scanner(System.in);

    public static void Calculator(int num1, int num2, int menuNumber) {

        boolean bool1 = true;

        System.out.println("=================================");
        System.out.println("          사칙연산 계산기");
        System.out.println("=================================");
        System.out.println("1. 덧셈  2. 뺄셈  3. 곱셈  4. 나눗셈");

        while (bool1) {
            System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해주세요.");
            num1 = in.nextInt();
            num2 = in.nextInt();
            menuNumber = in.nextInt();
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
                    if (num2==0) {
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

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, menuNumber = 0;
        Calculator(num1, num2, menuNumber);
    }
}
