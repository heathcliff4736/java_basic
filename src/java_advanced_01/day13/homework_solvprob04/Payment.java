package java_advanced_01.day13.homework_solvprob04;

public abstract class Payment implements Payable{
    protected String shopname;
    protected String productName;
    protected long productPrice;

    public Payment(String shopname, String productName, long productPrice) {
        this.shopname = shopname;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
