package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[11];
        int scoreCount = 0;

        while (true) {
            int score = sc.nextInt();
            if (score == 0) break;
            if (scoreCount >= 100) {
                System.out.println("입력 가능한 학생 수를 초과했습니다.");
                break;
            }

            int index = 10 - (score / 10);
            count[index]++;
        }

        for (int i = 0; i < 11; i++) {
            if (count[i] != 0) System.out.println((100 - i * 10) + " : " + count[i] + " person");
        }
    }
}
