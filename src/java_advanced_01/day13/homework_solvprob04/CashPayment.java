package java_advanced_01.day13.homework_solvprob04;

public class CashPayment extends Payment{
    private String casehReceiptNumber;

    public CashPayment(String shopname, String productName, long productPrice, String casehReceiptNumber) {
        super(shopname, productName, productPrice);
        this.casehReceiptNumber = casehReceiptNumber;
    }

    @Override
    public void pay() throws PayException {

    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "shopname='" + shopname + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
