package javabasic_02.day09.methodbasic;

import java.util.Scanner;

public class Calculator_yonghun {
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;

    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");

        while (a) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int menuNum = sc.nextInt();
            menu(num1,num2,menuNum);
        }
    }

    //사용자가 입력한 아이디와 비밀번호를 idPwPrint()를 이용하여 출력하세요.
    public static void calculator(int num1, int num2, int menuNum) {
        int result = 0;
        switch (menuNum) {
            case 1: result = num1 + num2; break;
            case 2: result = num1 - num2; break;
            case 3: result = num1 * num2; break;
            case 4: result = num1 / num2; break;
            case 5: a = false;
            default:
                System.out.println("숫자만 입력해주세요.");
        }
        menu2(num1,num2,menuNum,result);
    }
    public static void menu(int num1, int num2, int menuNum) {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");

        calculator(num1,num2,menuNum);

    }
    public static void menu2(int num1, int num2, int menuNum,int result) {
        switch (menuNum) {
            case 1: System.out.printf("%d + %d = %d \n",num1, num2,result); break;
            case 2: System.out.printf("%d - %d = %d \n",num1, num2,result); break;
            case 3: System.out.printf("%d * %d = %d \n",num1, num2,result); break;
            case 4: System.out.printf("%d / %d = %.1f \n",num1, num2,(double)result); break;
            case 5: a = false;

        }
    }
}
