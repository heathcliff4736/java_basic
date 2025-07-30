package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        char[] alpabet = new char[26];
        char al = 'A';

        for(int i=0; i<alpabet.length; i++){
            alpabet[i] = al;
            al++;
        }

        for(int i=alpabet.length-1; i>=0; i--){
            System.out.print(alpabet[i]+" ");
        }

    }
}
