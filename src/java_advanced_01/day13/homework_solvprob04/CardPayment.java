package java_advanced_01.day13.homework_solvprob04;

import java.security.PublicKey;

public class CardPayment extends Payment {
    private String cardNumber;
    private String cardPassword;
    int monthlyInstallment;

    public CardPayment(String shopname, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopname, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public void pay() throws PayException {

    }

    @Override
    public String toString() {
        return "신용카드가 정상적으로 지불되었습니다.\n" +
                "[ 신용카드 결제 정보 ]\n" +
                "상점명 : " + shopname + "\n"+
                "상품명 : " + productName + "\n"+
                "cardNumber='" + cardNumber + '\'' +
                ", cardPassword='" + cardPassword + '\'' +
                ", monthlyInstallment=" + monthlyInstallment +
                '}';
    }
}
