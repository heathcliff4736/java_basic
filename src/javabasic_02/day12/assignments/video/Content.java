package javabasic_02.day12.assignments.video;

public abstract class Content {
    private String title;
    private int price;

    public Content(String title) {
        this.title = title;
    }

    public Content(){}

    abstract void totalPrice();

    void show(){
        System.out.printf("%s비디오의 가격은 %d원 입니다.\n", this.title, this.price);
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
