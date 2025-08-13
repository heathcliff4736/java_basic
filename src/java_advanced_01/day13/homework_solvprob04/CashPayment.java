package java_advanced_01.day13.homework_solvprob04;

public class CashPayment extends Payment{
    private String casehReceiptNumber;

    public CashPayment(String shopname, String productName, long productPrice, String casehReceiptNumber) {
        super(shopname, productName, productPrice);
        this.casehReceiptNumber = casehReceiptNumber;
    }

    @Override
    public void pay() throws PayException {
        if (productPrice<=0) {
            throw new PayException("가격이 잘못되었습니다.");
        }
    }

    @Override
    public String toString() {
//        return "현금이 정상적으로 지불되었습니다.\n" +
//                "[ 현금 결제 정보 ]\n" +
//                "상점명 : " + shopname + "\n"+
//                "상품명 : " + productName + "\n"+
//                "상품가격 : " + productPrice + "\n"+
//                "현금영수증번호 : " + casehReceiptNumber;
        return String.format("""
                현금이 정상적으로 지불되었습니다.
                [ 현금 결제 정보 ]
                상점명 : %s
                상품명 : %s
                상품가격 : %d
                현금영수증번호 : %s
                """, shopname, productName,productPrice,casehReceiptNumber);
    }
}
