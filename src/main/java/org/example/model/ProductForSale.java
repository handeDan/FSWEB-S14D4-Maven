package org.example.model;

public abstract class ProductForSale {
    //instance variables:
    private String type;
    private double price;
    private String description;

    //constructor:
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    //getter methods:
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    //methods:
    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    //abstract methods:
    public abstract void showDetails();
}
