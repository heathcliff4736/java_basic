package javabasic_02.day12.assignments.coffeeshop;

public abstract class Beverage {
    private String name;
    protected int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Beverage(String name){}

    public abstract void CalPrice();

    void print(){
        System.out.println("");
    }
}
