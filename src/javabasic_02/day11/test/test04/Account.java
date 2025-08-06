package javabasic_02.day11.test.test04;

public class Account {
    private String accNo;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(accNo + " 계좌가 개설되었습니다.");
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void save(int save) {
        setBalance(this.balance + save);
        System.out.println(getAccNo() + " 계좌에 " + save + "만원이 입금되었습니다.");
    }

    void deposit(int deposit) {
        setBalance(this.balance - deposit);
        System.out.println(getAccNo() + " 계좌에 " + deposit + "만원이 출금되었습니다.");
    }
}
