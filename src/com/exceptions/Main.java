package com.exceptions;

public class Main {
    public static void main(String[] args) {
        catchE();
    }

    private static void catchE() {
        try {
            int x = 5/0;
        } catch (Exception e){ //in cazul asta merge si ArithmeticException in loc de Exception
            System.out.println("Exception is caught and handled!");
            e.printStackTrace();
        } finally {
            System.out.println("This will be printed no matter what the value of y is"); // y este 5 in cazul asta
        }
    }
}
