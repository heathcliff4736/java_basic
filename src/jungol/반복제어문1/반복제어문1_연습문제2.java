package jungol.반복제어문1;

public class 반복제어문1_연습문제2 {
    public static void main(String[] args) {

        int num = 0;
        int sum = num;
        while (true) {
            num = num + 1;
            if (num > 10) {
                break;
            }
            sum = sum + num;
        }
        System.out.printf("1부터 10까지의 합 = %d\n", sum);
        System.out.printf("while문이 끝난 후의 num의 값 = %d", num);
    }
}

//    정수 변수 num을 선언하여 1을 대입한 후 1씩 증가시키면서 10까지의 누적 합을 구하는 프로그램을
//    while문을 이용하여 작성하고, 1부터 10까지의 합과 while문이 끝난 후의 num의 값을 출력하는 프로그램을 작성하시오.
//
//    출력
//    1부터 10까지의 합 = 55
//    while문이 끝난 후의 num의 값 = 11

