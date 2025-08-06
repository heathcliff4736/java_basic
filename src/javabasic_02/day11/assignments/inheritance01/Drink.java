package javabasic_02.day11.assignments.inheritance01;

public class Drink {
    private String name;
    private int price;
    private int count;

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Drink() {}

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public int getTotalPrice(){
        int totalPrice = this.price*this.count;
        return totalPrice;
    }

    static void printTitle(){
        System.out.println("상품명\t\s단가\t\s수량\t\s금액");
    }

    void printData(){
        System.out.println(this.name+"\t\t\s"+this.price+"\t\s"+this.count+"\t\t\s"+getTotalPrice());
    }
}
