package jungol.반복제어문3;

public class 반복제어문3_연습문제5 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){
            for (int j=5; j>i; j--) {
                System.out.print(" ");
            }
            for (int j=1; j<i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
