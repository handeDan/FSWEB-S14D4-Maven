package org.example.model;

public class Coke extends ProductForSale{
    //instance variables:
    private double liter;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    //overloading:
    public Coke(String type, double price, String description, double liter) {
        super(type, price, description);
        this.liter = liter;
    }

    //getter methods:
    public double getLiter() {
        return this.liter;
    }

    //methods:
    @Override
    public void showDetails() {
        System.out.println("Coke type: "+ getType());
        System.out.println("Coke price: "+ getPrice());
        System.out.println("Coke description: "+ getDescription());
        System.out.println("Coke liter: "+ getLiter());
    }
}
