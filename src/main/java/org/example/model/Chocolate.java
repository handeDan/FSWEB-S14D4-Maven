package org.example.model;

public class Chocolate extends ProductForSale{
    //instance variables:
    private double gram;

    public Chocolate(String type, double price, String description, double gram) {
        super(type, price, description);
        this.gram = gram;
    }

    //overloading:
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    //getter methods:
    public double getGram() {
        return this.gram;
    }

    //methods:
    @Override
    public void showDetails() {
        System.out.println("Chocolate type: "+ getType());
        System.out.println("Chocolate price: "+ getPrice());
        System.out.println("Chocolate description: "+ getDescription());
        System.out.println("Chocolate gram: "+ getGram());
    }
}
