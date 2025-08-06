package javabasic_02.day11.assignments.inheritance01;

public class Alcohol extends Drink{

    private double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    static void printTitle() {
        System.out.println("상품명(도수[%])\t\s단가\t\s수량\t\s금액");
    }

    @Override
    void printData(){
        System.out.println(getName()+"("+this.alcper+")"+"\t\t\s"+getPrice()+
                "\t\s"+getCount()+"\t\t\s"+getTotalPrice());
    }
}
