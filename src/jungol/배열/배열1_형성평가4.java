package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] outputArray = new Integer[100];
        int cnt = 0;

        for (int i = 0; i < outputArray.length; i++) {
            int input = sc.nextInt();
            if (input == -1) break;
            outputArray[cnt++] = input;
        }

        // 입력받은 수가 3개 이하일 때 ?
        int start = (cnt < 3) ? 0 : cnt - 3;
        for (int i = start; i < cnt; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}
