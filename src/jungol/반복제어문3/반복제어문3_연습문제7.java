package jungol.반복제어문3;

public class 반복제어문3_연습문제7 {
    public static void main(String[] args) {

        char ch = 'a';
        int n = 4;
        int temp = 0;
        int temp2 = 1;
        int x;

        for (int i = 1; i <= n; i++) {
            for (int j = 1 + temp; j <= i + temp; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            temp += i;
            for (x = temp2; x <= temp2-i+n; x++) {
                System.out.print(x + " ");
            }
            temp2 = x;
            System.out.println();
        }
    }
}
