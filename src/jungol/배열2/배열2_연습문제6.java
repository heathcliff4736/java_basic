package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] scores = new int[4][4];
        int subjectTotal;

        // 입력
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 학생의 점수 ");
            for (int j = 0; j < 3; j++) {
                scores[i][j] = sc.nextInt();
                scores[i][3] += scores[i][j];   // 개인 합
                scores[3][j] += scores[i][j];   // 과목 합
            }
            scores[3][3] += scores[i][3];   // 총 합
        }

        // 출력
        System.out.println("     국어 영어 수학 총점");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %d번", i+1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", scores[i][j]);
            }
            System.out.println();
        }

        System.out.print("합계");
        for (int j = 0; j < 4; j++) {
            System.out.printf("%4d", scores[3][j]);
        }
    }
}
