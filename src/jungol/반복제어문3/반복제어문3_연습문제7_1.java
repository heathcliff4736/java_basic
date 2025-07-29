package jungol.반복제어문3;

public class 반복제어문3_연습문제7_1 {
    public static void main(String[] args) {

        int temp = 1;
        int j = 0;


        for (int i = 1; i <= 4; i++) {
            for (j = temp; j <= temp-i+4; j++) {
                System.out.print(j + " ");
//                System.out.print("*");
//                System.out.printf("(%d, %d) ", i, j);
            }
            temp = j;
            System.out.println();
        }
    }
}
