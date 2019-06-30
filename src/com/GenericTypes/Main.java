package com.GenericTypes;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(185.5);
        Person p2 = new Person(175.8);
        System.out.println(p1.compareTo(p2));

        Developer d1 = new Developer(170,6000);
        Developer d2 = new Developer(150,8000);
        System.out.println(d1.compareTo(d2));
        System.out.println();

        Generic<String> strings = new Generic<>(2);
        Generic<Integer> ints = new Generic<>(3);
        Generic<Double> doubles = new Generic<>(2);

        String s1 = "abc";
        String s2 = "aaa";
        strings.add(s1);
        strings.add(s2);
        strings.print();

        int i1 = 15;
        int i2 = 14;
        int i3 = 2;
        ints.add(i1);
        ints.add(i2);
        ints.add(i3);
        System.out.println();
        ints.print();

        double double1 = 1.5;
        double double2 = 2.5;
        doubles.add(double1);
        doubles.add(double2);
        System.out.println();
        doubles.print();




    }
}
