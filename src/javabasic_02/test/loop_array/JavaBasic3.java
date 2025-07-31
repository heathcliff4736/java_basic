package javabasic_02.test.loop_array;

public class JavaBasic3 {
    public static void main(String[] args) {

        while (true) {
            int firstDice = (int) (Math.random()*6+1);
            int secondDice = (int) (Math.random()*6+1);
            System.out.printf("(숫자1: %d, 숫자2: %d)\n", firstDice, secondDice);
            if (firstDice+secondDice==5) break;
        }
        System.out.println("숫자의 합이 5가 되는 경우의 수 출력");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if(i+j==5){
                    System.out.printf("(%d, %d)\n", i, j);
                }
            }
        }
    }
}
