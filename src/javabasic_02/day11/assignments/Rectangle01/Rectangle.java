package javabasic_02.day11.assignments.Rectangle01;

public class Rectangle {

    private int width;
    private int height;
    private String color;
    private int area;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return calculateArea();
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int calculateArea() {
        return this.width * this.height;
    }
}
