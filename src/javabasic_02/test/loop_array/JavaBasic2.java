package javabasic_02.test.loop_array;

public class JavaBasic2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i < 100; i += 3) {
            sum += i;
        }
        System.out.print(sum);
    }
}
