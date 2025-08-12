package javabasic_02.day12.assignments.coffeeshop;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void calcPrice();

    void print(){
        System.out.println("");
    }
}
