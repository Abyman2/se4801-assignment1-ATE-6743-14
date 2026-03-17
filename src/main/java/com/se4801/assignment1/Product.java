package com.se4801.assignment1;

public abstract class Product {

    protected String id;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public abstract double calculateDiscount(double percentage);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}