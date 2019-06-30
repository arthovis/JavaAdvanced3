package com.GenericTypes;

public class Developer extends Person implements Comparable<Developer>{
    private double salariu;

    public Developer(double height, double salariu) {
        super(height);
        this.salariu = salariu;
    }

    public double getSalariu(){
        return salariu;
    }

    @Override
    public int compareTo(Developer o){
        int equality = 0;
        System.out.println("Comparing developers...");
        if(this.salariu>o.salariu){
            equality = 1;
        } else if (this.salariu<o.salariu){
            equality = -1;
        } else {
            equality=super.compareTo(o);
        }

        return equality;
    }


}
