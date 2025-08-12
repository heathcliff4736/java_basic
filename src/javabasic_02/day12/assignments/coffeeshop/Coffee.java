package javabasic_02.day12.assignments.coffeeshop;

public class Coffee extends Beverage{
    static int amount = 0;

    public Coffee(String name) {
        super(name);
    }

    @Override
    public void calcPrice() {
        switch (getName()){
            case "Americano" -> {
                setPrice(1500);
                amount++;
            }
            case "CafeLatte" -> {
                setPrice(2500);
                amount++;
            }
            case "Cappuccino" -> {
                setPrice(3000);
                amount++;
            }
        }
    }

//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
}
