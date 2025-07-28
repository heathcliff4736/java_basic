package jungol.연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 연산자_연습문제2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("5개의 수를 입력하시오. ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();

        System.out.printf("%d ", n1+3);
        System.out.printf("%d ", n2-3);
        System.out.printf("%d ", n3*3);
        System.out.printf("%d ", n4/3);
        System.out.printf("%d", n5%3);

    }

    /*public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];

        System.out.print("5개의 수를 입력하시오. ");
        for(int i = 0; i < 5; i++){
            int input = Integer.parseInt(bufferedReader.readLine());

            switch(i) {
                case 0 -> {array[i] = input + 3 ; }
                case 1 -> {array[i] = input - 3 ; }
                case 2 -> {array[i] = input * 3 ; }
                case 3 -> {array[i] = (int)(input / 3) ; }
                case 4 -> {array[i] = input % 3 ; }
            }
        }

        for(int i : array) {
            System.out.print(i + " ");
        }

        bufferedReader.close();
    }*/
}
