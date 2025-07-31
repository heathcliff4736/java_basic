package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] outputArray = new Integer[100];
        int i, cnt = 0;

        for (i = 0; i < outputArray.length; i++) {
            outputArray[i] = sc.nextInt();

            if (outputArray[i] == -1) break;

            cnt++;
        }
        for (i = cnt-3; i < cnt; i++) {
            System.out.print(outputArray[i]+" ");
        }
    }
}
