package javabasic_01.day03;

import java.util.Scanner;

public class BlockScope3 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("반지름을 입력하세요: ");
        int radiusRound = sc1.nextInt();
        double extentRound = Math.PI * radiusRound * radiusRound;

        System.out.printf("반지름이 %d인 원의 넓이: %.1f", radiusRound, extentRound);
    }
}
