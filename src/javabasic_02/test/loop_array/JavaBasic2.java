package javabasic_02.test.loop_array;

public class JavaBasic2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 3;
        for (int i = n; i <= 100; i += n) {
            sum += i;
        }
        System.out.print(sum);
    }
}
