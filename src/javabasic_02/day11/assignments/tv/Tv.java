package javabasic_02.day11.assignments.tv;

public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public Tv() {
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

//    public Tv() {}

    public void power(){
        this.power = !power;
    }

    public void channelUp(){
        this.channel++;
    }

    public void print(){
        System.out.printf("color :%-8s power:%-8b channel:%-8d\n", this.color, this.power, this.channel);
    }

}
