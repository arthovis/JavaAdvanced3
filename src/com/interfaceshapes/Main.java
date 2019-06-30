package com.interfaceshapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti prima valoare:");
        int a= input.nextInt();
        System.out.println("Introduceti a doua valoare");
        int b = input.nextInt();
        Rectangle myRectangle = new Rectangle(a,b);
        System.out.println(myRectangle.getArea());
        Shape myShape=myRectangle;
        System.out.println(myShape.getParameter());
        System.out.println();
        myRectangle.print();
    }
}
