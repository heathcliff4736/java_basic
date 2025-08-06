package javabasic_02.day11.assignments.Rectangle02;

public class Rectangle {

    private int width;
    private int length;
    private String color;
    private int area;

    public Rectangle(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int area() {
        return this.width * this.length;
    }

    public int perimeter() {
        return (this.width + this.length) * 2;
    }
}
