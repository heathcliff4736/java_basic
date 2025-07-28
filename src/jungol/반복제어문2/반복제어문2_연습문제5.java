package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_연습문제5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i=0; i<10; i++){
            int num1 = sc.nextInt();
            if(num1%2==0){
                sum += 1;

            }
        }
        System.out.printf("입력받은 짝수는 %d개입니다.", sum);

    }
}
