package javabasic_02.day12.assignments.coffeeshop;

public class Tea extends Beverage{
    static int amount;

    public Tea(String name) {
        super(name);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void calcPrice() {
        switch (getName()){
            case "lemonTea" -> {
                setPrice(1500);
                amount++;
            }
            case "ginsengTea" -> {
                setPrice(2000);
                amount++;
            }
            case "redginsengTea" -> {
                setPrice(2500);
                amount++;
            }
        }
    }


}
