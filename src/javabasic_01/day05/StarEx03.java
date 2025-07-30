package javabasic_01.day05;

public class StarEx03 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        int n = 4;

        for (int i=1; i<=n; i++){
            for (int j=n; j>i; j--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
