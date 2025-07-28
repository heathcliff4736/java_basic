package day04;

import java.util.Scanner;

public class SwitchEx02 {
    public static void main(String[] args) {

        System.out.print("학점 알파벳을 입력해주세요\n");
        Scanner in = new Scanner(System.in);
        char grade = in.next().charAt(0);

        switch (grade) {
//            case -> :System.out.println();
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력 요함");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}
