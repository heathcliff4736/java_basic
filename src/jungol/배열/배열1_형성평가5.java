package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가5 {
    public static void main(String[] args) {

        int sum = 0;
        int cnt = 0;
        double avg;
        Scanner sc = new Scanner(System.in);

        double[] outputArray = new double[100];

        for (int i = 0; i < outputArray.length; i++) {
            double input = sc.nextDouble();
            outputArray[i++] = input;
            sum += input;
            cnt++;
        }
        avg = (double)sum/cnt;
        System.out.print(avg);

    }
}
