package com.GenericTypes;

public class Person implements Comparable<Person> {
    private double height;

    public Person(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public int compareTo(Person o) {
        int equality = 0;
        if (this.height>o.getHeight()){
            equality =1;
        } else if (this.height<o.getHeight()){
            equality =-1;
        }
        return equality;
    }


}
