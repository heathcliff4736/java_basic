package javabasic_02.day07;

public class DoubleArrayEx01 {
    public static void main(String[] args) {

        // 학생 3명의 국어, 영어, 수학 점수를 관리하는 이차원 배열을 만드세요
        int[][] scores = new int[3][3];

        // 1번학생의 국어:90 영어:50 수학:80을 저장하고 출력하세요
        scores[0][0] = 90;
        scores[0][1] = 50;
        scores[0][2] = 80;

        // 2번학생
        scores[1][0] = 80;
        scores[1][1] = 100;
        scores[1][2] = 90;

        // 3번학생
        scores[2][0] = 100;
        scores[2][1] = 90;
        scores[2][2] = 90;

        // 각 학생들의 국어, 영어, 수학 점수를 학생별로 출력하세요
        System.out.printf("%8s 국어 영어 수학 총점 평균\n","");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0; // 총점
            int[] score = scores[i];
            System.out.print("학생 " +(i+1)+":  ");
            for (int j = 0; j < score.length; j++) {
                System.out.print(score[j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        /*for (int[] score : scores) {
            System.out.print("학생 ");
            for (int s : score) {
                System.out.print(s+" ");
            }
            System.out.println();
        }*/
    }
}
