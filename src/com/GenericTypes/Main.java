package com.GenericTypes;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(185.5);
        Person p2 = new Person(175.8);
        System.out.println(p1.compareTo(p2));

        Developer d1 = new Developer(170,6000);
        Developer d2 = new Developer(150,8000);
        System.out.println(d1.compareTo(d2));
    }
}
