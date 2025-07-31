package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int scIn;
        String sc1;
        boolean bool1 = true;

        while (bool1){
            System.out.println("=======================================");
            System.out.println("1. 예금  | 2. 출금  | 3. 잔고  | 4. 종료  ");
            System.out.println("=======================================");
            System.out.print("선택> ");
            sc1 = sc.nextLine();
            int bankAccount = 0;

            if(sc1.equals("1")) {
                System.out.printf("예금액>");
                scIn = sc.nextInt();
                bankAccount += scIn;
            } else if (sc1.equals("2")){
                System.out.printf("출금액>");
                scIn = sc.nextInt();
                bankAccount -= scIn;
            } else if (sc1.equals("3")){
                System.out.printf("잔고>%d", bankAccount);
            } else if (sc1.equals("4")){
                System.out.println();
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println(sc1);
//                bool1 = false;
                break;
            }
            System.out.println();

        }

    }
}
