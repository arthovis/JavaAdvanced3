package com.interfaceshapes;

public class Rectangle implements Shape  {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getParameter() {
        return 2*(a+b);
    }

    @Override
    public String toString(){
        String str = "\n";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                str=str+"*";
            }
            str=str+"\n";
        } return str;
    }
}
