package jungol.배열;

import java.util.Arrays;

public class 배열1_연습문제9_api {
    public static void main(String[] args) {

        int[] outputArray = {95, 75, 85, 100, 50};

        Arrays.sort(outputArray); // 오름차순 정렬 처리

        for (int i : outputArray) {
            System.out.print(i+" ");
        }
    }
}
