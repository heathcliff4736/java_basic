package java_advanced_01.day17.lamdaEx.lamda01;

import java.util.Scanner;

public class LamdaEx01 {

    // 사용자가 입력한 숫자 두개의 결과를 처리
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Consumer 타입 (단일 입력을 받아 수락(사용)하고 결과를 반환화지 않는 함수
        action((x, y) -> {
                    System.out.println(x + y);
                }
        );

        action((x, y) -> { System.out.println(x - y); }
        );
    }

    // single 추상메소드를 갖고있는 함수형 인터페이스
    public static void action(Calculable calculable) {
        // 데이터 부
        System.out.println("Enter num1: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Enter num1: ");
        int y = Integer.parseInt(sc.nextLine());
//        int x = 10;
//        int y = 2;
        calculable.calculate(x, y);
    }
}
