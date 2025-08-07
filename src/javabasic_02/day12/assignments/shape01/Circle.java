package javabasic_02.day12.assignments.shape01;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        setName(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculationArea() {
        this.area = Math.PI * radius * radius;
    }

    @Override
    void print() {
        System.out.printf("%s의 면적은 %.13f\n", getName(), this.area);
    }
}
