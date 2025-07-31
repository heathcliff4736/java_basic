package javabasic_02.test.loop_array;

public class JavaBasic7 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4 - i * 2; j > 1; j--) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
