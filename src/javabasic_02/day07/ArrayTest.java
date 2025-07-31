package javabasic_02.day07;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.print(a[0]+a[3]);
        System.out.println();

        char[] c = {'A', 'P', 'P', 'L', 'E'};
        for (int i = 0; i < c.length; i++) {
            System.out.print(Character.toLowerCase(c[i]));
        }
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print((char) (c[i]+32));
        }
        System.out.println();

        for (char c1 : c) {
            System.out.print(Character.toLowerCase(c1));
        }
    }
}
