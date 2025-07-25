package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 0;

        while (true) {
            i = i + 1;
            if (i > n) {
                break;
            }

            sum = sum + i;
//            System.out.println(i);
//            System.out.println(n);
//            System.out.println(sum);
        }
        System.out.println(sum);
//        System.out.println(n);
    }
}


// 100 이하의 양의 정수만 입력된다. while 문을 이용하여
// 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.