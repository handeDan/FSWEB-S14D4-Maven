package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("Dark chocolate", 5.99, "with nuts", 200),
                new Coke("Light coke", 3.20, "for diet"),
                new Bread("Grain bread", 1.19, "whole grain")
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            product.showDetails();
        }
    }
}