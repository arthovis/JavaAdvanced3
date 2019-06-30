package com.exercitiiException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        while (input.hasNext()){
            String line = input.nextLine();
            try {
                int i = Integer.parseInt(line);
                System.out.println("Numarul este: "+i);
            } catch (NumberFormatException e){
                try {
                    double d = Double.parseDouble(line);
                    System.out.println("Numarul este: "+d);
                } catch (NumberFormatException e1){
                    System.out.println("Nu e numar. Learn your numbers, bitch!");
                    e1.printStackTrace();
                    break;
                }
            }
        }
    }
}
