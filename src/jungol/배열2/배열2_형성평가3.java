package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[10];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            numbers[i] = (numbers[i-2] + numbers[i-1])%10;

//            numNext = num1 + num2;
//            numbers[i-2] = numNext;
//            num1 = num2;
//            num2 = numNext;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
