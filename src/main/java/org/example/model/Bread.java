package org.example.model;

public class Bread extends ProductForSale{
    //instance variables:
    private double gram;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    //overloading:
    public Bread(String type, double price, String description, double gram) {
        super(type, price, description);
        this.gram = gram;
    }

    //getter methods:
    public double getGram() {
        return this.gram;
    }

    //methods:
    @Override
    public void showDetails() {
        System.out.println("Bread type: "+ getType());
        System.out.println("Bread price: "+ getPrice());
        System.out.println("Bread description: "+ getDescription());
        System.out.println("Bread gram: "+ getGram());
    }

}
