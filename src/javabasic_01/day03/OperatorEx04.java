package javabasic_01.day03;

public class OperatorEx04 {
    public static void main(String[] args) {

//        & bit 단위로 논리연산을 수행한다. 대상은 bit 0, 1
//        피연산자가 2진수 0과 1로 저장되는 정수타입(byte, short, int, long)만 대상이 된다.
//        실수타입(float, double) bit연산의 대상이 될 수 없다.

        int num1 = 1;
        int result1 = num1 <<3;
        //Math.pow(2,3) => 2의 3제곱 =>
        int result2 = num1 * (int) Math.pow(2,3);
        System.out.println("result1 :"+result1);
        System.out.println("result2 :"+result2);

    }
}
