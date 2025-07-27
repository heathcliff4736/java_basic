package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.printf("%d %d\n", ++num1, num2--);
        System.out.printf("%d %d\n", num1, num2);

//        System.out.printf("a++ = %d, ++b = %d\n", a++, ++b);
//        System.out.printf("실행후 a = %d, b = %d\n\n", a, b);
//        System.out.printf("a-- = %d, --b = %d\n", a--, --b);
//        System.out.printf("실행후 a = %d, b = %d\n", a, b);

    }
}
