package com.GenericTypes;

public class Person {
    private double height;

    public Person(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }


    protected int compareTo(Person o) {
        int equality = 0;
        System.out.println("Comparing persons...");
        if (this.height>o.getHeight()){
            equality =1;
        } else if (this.height<o.getHeight()){
            equality =-1;
        }
        return equality;
    }


}
