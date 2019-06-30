package com.shapes;

public class Dreptunghi extends Shape {
    private int length;
    private int width;

    public Dreptunghi(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {

        double perimeter = 2*(length+width);
        return perimeter;
    }

    @Override
    public double getArea() {

        double area = length*width;
        return area;
    }
}
