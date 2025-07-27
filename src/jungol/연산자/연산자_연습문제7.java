package jungol.연산자;

public class 연산자_연습문제7 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 2;

        System.out.printf("%d %d %d %d\n",
//                ((a == 1) && (b == 1)) ? 1 : 0,
                ((a != 0) && (b != 0)) ? 1 : 0,
//                ((a == 1) || (b == 1)) ? 1 : 0,
                ((a != 0) || (b != 0)) ? 1 : 0,
//                ((b == 1) && (c == 2)) ? 1 : 0,
                ((b != 0) && (c != 0)) ? 1 : 0,
//                (a != 1) ? 1 : 0
//                (!(a == 1)) ? 1 : 0
                (!(a != 0)) ? 1 : 0
        );
    }
}

