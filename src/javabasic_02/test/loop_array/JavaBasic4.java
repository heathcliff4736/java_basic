package javabasic_02.test.loop_array;

public class JavaBasic4 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (i = 0; i <= 60; i++) {
            for (j = 0; j <= 60; j++) {
                if(4*i+5*j==60){
                    System.out.printf("(%d, %d)\n", i, j);
                }
            }

        }
    }
}
