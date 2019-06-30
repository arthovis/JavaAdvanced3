package com.shapes;

public class Cerc extends Shape {
    private int raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*(Math.PI*raza);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = 2*(Math.PI*Math.pow(raza,2));
        return area;
    }
}
