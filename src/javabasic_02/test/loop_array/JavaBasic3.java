package javabasic_02.test.loop_array;

public class JavaBasic3 {
    public static void main(String[] args) {

        while (true) {

            double dice1 = Math.random()*6+1;
            double dice2 = Math.random()*6+1;
            int firstDice = (int) dice1;
            int secondDice = (int) dice2;

            System.out.printf("(숫자1: %d, 숫자2: %d)\n", firstDice, secondDice);
            if (firstDice+secondDice==5) break;

        }
        System.out.println("숫자의 합이 5가 되는 경우의 수");
    }
}
