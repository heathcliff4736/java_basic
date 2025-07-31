package javabasic_02.test.loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaBasic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String sc1;
        int sum = 0;
        int max;
        double avg = 0.0;
        int[] scores = null;
        while(true){
            System.out.println("=====================================================");
            System.out.println("1.학생수  | 2.점수입력  | 3.점수리스트  | 4.분석  | 5. 종료");
            System.out.println("=====================================================");
            System.out.print("선택> ");
            sc1 = sc.nextLine();
            if(sc1.equals("1")){
                System.out.print("학생수> ");
                scores = new int[sc2.nextInt()];
            } else if (sc1.equals("2")){
                for (int j = 0; j < scores.length; j++) {
                    System.out.printf("scores[%d]: ", j);
                    scores[j] = sc2.nextInt();
//                    sum += scores[j];
//                    avg = (double) sum/(scores.length);
                }
                System.out.println();
            } else if (sc1.equals("3")){
                for (int j = 0; j < scores.length; j++) {
                    System.out.printf("scores[%d]: %d\n", j, scores[j]);
                }
            } else if (sc1.equals("4")){
                max = Arrays.stream(scores).max().getAsInt();
                avg = Arrays.stream(scores).average().getAsDouble();
                System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, avg);

            } else if (sc1.equals("5")){
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}
