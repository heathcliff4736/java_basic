package javabasic_01.day05;

public class StarEx02 {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
