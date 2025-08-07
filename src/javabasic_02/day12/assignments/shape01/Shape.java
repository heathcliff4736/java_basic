package javabasic_02.day12.assignments.shape01;

public abstract class Shape {
    protected double area;
    private String name;

    public Shape(double area, String name) {
        this.area = area;
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public Shape(){}

    abstract void calculationArea();

    void print() {
        System.out.printf("%s의 면적은 %f\n", this.name, this.area);
    }
}
