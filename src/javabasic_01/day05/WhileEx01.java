package javabasic_01.day05;

public class WhileEx01 {
    public static void main(String[] args) {
        int loop = 1;
        int total = 0;

        while(loop <= 100){
            total += loop;
            System.out.print(loop+" ");
            loop += 1;
        }
        System.out.println("\n1~100의 합 = " + total);
    }
}
