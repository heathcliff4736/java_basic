package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int scIn;
        String sc1;
        int bankAccount = 0;
        boolean bool1 = true;

        while (bool1){
            System.out.println("=======================================");
            System.out.println("1. 예금  | 2. 출금  | 3. 잔고  | 4. 종료  ");
            System.out.println("=======================================");
            System.out.print("선택> ");
            sc1 = sc.nextLine();


            switch (sc1){
                case "1" :
                    System.out.printf("예금액>");
                    scIn = sc2.nextInt();
                    bankAccount += scIn;
                    break;
                case "2" :
                    System.out.printf("출금액>");
                    scIn = sc2.nextInt();
                    if(bankAccount-scIn<0) {
                        System.out.println("잔액보다 큰 금액을 출금할 수 없습니다!");
                        break;
                    }
                    bankAccount -= scIn;
                    break;
                case "3" :
                    System.out.printf("잔고>%d", bankAccount);
                    break;
                case "4" :
                    System.out.println();
                    System.out.println("프로그램 종료");
                    bool1 = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
//                    System.out.println(sc1);
                    break;
            }
            System.out.println();

        }

    }
}
