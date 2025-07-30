package javabasic_01.day04;

public class ForEx02 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i=1; i<=10; i++){
//            System.out.println(i+" ");
//            sum = sum + i;
            sum += i;
        }
        System.out.println(sum);
    }
}
