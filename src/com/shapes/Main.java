package com.shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului: ");
        int length = input.nextInt();
        System.out.println("Introduceti latimea dreptunghiului: ");
        int width = input.nextInt();
        Dreptunghi dreptunghi = new Dreptunghi(length,width);
        System.out.println("Perimetrul dreptunghiului este: "+dreptunghi.getPerimeter());
        System.out.println("Aria dreptunghiului este: "+dreptunghi.getArea());
        System.out.println();
        System.out.println("Introduceti raza cercului: ");
        int raza = input.nextInt();
        Cerc cerc = new Cerc(raza);
        System.out.printf("Perimetrul cercului este: %.2f",cerc.getPerimeter());
        System.out.println();
        System.out.printf("Aria cercului este: %.2f ",cerc.getArea());
    }

}
