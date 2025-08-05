package javabasic_02.day10.morningtest;

public class Account {
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;
    private int balance;    // 통장 (입출금 내역 및 잔고 확인)
    private String accountNo;   // 계좌번호
    private String owner;       // 소유자

    // 은행에 가서 계좌개설 신청하면 개인정보를 은행에 등록하는 첫 과정
    Account(String accountNo, String owner, int balance){
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNo() { return accountNo; }

    public String getOwner() { return owner; }

    public int getBalance() { return this.balance; }

    public void setBalance(int balance) {
        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
            this.balance = getBalance();
            System.out.println("입력 범위를 초과하였습니다.");
        }
        else {
            this.balance = balance;
        }
    }

}
