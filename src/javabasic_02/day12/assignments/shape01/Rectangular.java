package javabasic_02.day12.assignments.shape01;

import static java.lang.Integer.parseInt;

public class Rectangular extends Shape{
    private double width;
    private String height;

    public Rectangular(double width, String height) {
        this.width = width;
        this.height = height;
    }
    public Rectangular(String name, int width, int height) {
        setName(name);
        this.width = width;
        this.height = toString(height);
    }

    public String toString(int num){
        return ""+num;
    }

    public double getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    void calculationArea() {
        this.area = (int)this.width * parseInt(this.height);
    }

    @Override
    void print() {
        System.out.printf("%s의 면적은 %.1f\n", getName(), this.area);
    }
}
