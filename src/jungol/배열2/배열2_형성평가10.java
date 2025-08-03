package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char array[][] = new char[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = sc.next().charAt(0);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Character.toLowerCase(array[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
