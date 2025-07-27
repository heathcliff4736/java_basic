package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        int Height1 = in1.nextInt();
        int Weight1 = in1.nextInt();

//        Scanner in2 = new Scanner(System.in);
        int Height2 = in1.nextInt();
        int Weight2 = in1.nextInt();

        boolean result = (Height1 > Height2) && (Weight1 > Weight2);
        System.out.println(result ? 1 : 0);
    }
}
