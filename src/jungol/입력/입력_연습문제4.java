package jungol.입력;

public class 입력_연습문제4 {
    public static void main(String[] args) {

        int a = 5;
        Double b = 3.140000;
        Double circum = 2*a*b;
        Double extent = a*a*b;

        System.out.printf("원주 = %d * 2 * %f = %f\n", a, b, circum);
        System.out.printf("넓이 = %d * %d * %f = %f\n", a, a, b, extent);

    }
}
