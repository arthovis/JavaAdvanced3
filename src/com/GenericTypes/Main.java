package com.GenericTypes;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(185.5);
        Person p2 = new Person(175.8);
        System.out.println(p1.compareTo(p2));
    }
}
