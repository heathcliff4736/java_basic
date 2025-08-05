package javabasic_02.day10.morningtest;

import java.util.Scanner;

public class BankApplication {
    static Scanner in = new Scanner(System.in);
    static Account[] arrayAccount = new Account[100];
    static int accountCount = 0;
    static boolean run = true;

    // 1. 계좌생성 기능        - private static void createAccount()
    private static void createAccount() {
        System.out.println("-------------------");
        System.out.println("      계좌 생성      ");
        System.out.println("-------------------");
        System.out.print("계좌번호 : ");
        String accountNo = in.nextLine();
        System.out.print("계좌주 : ");
        String owner = in.nextLine();
        System.out.print("초기입금액 : ");     // 계산을 위한 정수로 형변환
        int balance = Integer.parseInt(in.nextLine());

        // 새로운 계좌 생성
        Account newAccount = new Account(accountNo, owner, balance);

        arrayAccount[accountCount] = newAccount;
        accountCount++;

        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    // 2. 계좌목록 보기 기능    - private static void accountList()
    private static void accountList() {
        System.out.println("-------------------");
        System.out.println("      계좌목록      ");
        System.out.println("-------------------");
        for (int i = 0; i < accountCount; i++) {
            System.out.printf("%s\t %s\t %d\n",
                    arrayAccount[i].getAccountNo(), arrayAccount[i].getOwner(), arrayAccount[i].getBalance());
        }
    }

    // 3. 예금 기능           - private static void deposit()
    private static void deposit() {
        System.out.println("-------------------");
        System.out.println("      예금      ");
        System.out.println("-------------------");
        System.out.print("계좌번호 : ");
        String accountNo = in.nextLine();
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(in.nextLine());
        // 계좌 있는만큼 포문 돌리고
        for (int i = 0; i < accountCount; i++) {
            // 계좌번호 같은걸 찾으면
            if (accountNo.equals(arrayAccount[i].getAccountNo())) {
                // 셋발란스 = 겟발란스 + 입력받은 발란스
                arrayAccount[i].setBalance((balance - arrayAccount[i].getBalance()));
                System.out.println("결과: 예금이 성공적으로 완료되었습니다.");
            } else {
                System.out.println("해당하는 계좌가 존재하지 않습니다.");
            }
        }
    }

    // 4. 출금 기능           - private static void withdraw()
    private static void withdraw() {
        System.out.println("-------------------");
        System.out.println("      출금      ");
        System.out.println("-------------------");
        System.out.print("계좌번호 : ");
        String accountNo = in.nextLine();
        System.out.print("출금액 : ");
        int balance = Integer.parseInt(in.nextLine());

        for (int i = 0; i < accountCount; i++) {
            if (accountNo.equals(arrayAccount[i].getAccountNo())) {
                if ((arrayAccount[i].getBalance() - balance) >= 0) {
                    arrayAccount[i].setBalance((arrayAccount[i].getBalance() - balance));
                    System.out.println("결과: 출금이 성공적으로 완료되었습니다.");
                //잔고보다 많은 금액을 출금하지 못하도록
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
            } else {
                System.out.println("해당하는 계좌가 존재하지 않습니다.");
            }
        }

    }

    // 5. 프로그램 종료 기능   - private static void exit()
    private static void exit() {
        System.out.println("프로그램 종료");
        run = false;
    }

    // Bank application 시작 - main()
    public static void main(String[] args) {

        while (run) {
            String menu = """
                    ---------------------------------------------
                    1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                    ---------------------------------------------
                    """;
            System.out.print(menu);
            System.out.print("선택> ");

            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> accountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> exit();
                default -> System.out.println("1~5의 숫자를 입력하세요6");
            }
        }
    }
}
