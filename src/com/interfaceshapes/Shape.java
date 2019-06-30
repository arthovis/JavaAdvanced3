package com.interfaceshapes;

public interface Shape {
    double getArea();
    double getParameter();

    default void print(){
        System.out.println("Shape: "+this);
    }
}
