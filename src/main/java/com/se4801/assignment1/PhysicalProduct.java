package com.se4801.assignment1;

public class PhysicalProduct extends Product {

    private double weightKg;

    public PhysicalProduct(String id, String name, double price, int stock, double weightKg) {
        super(id, name, price, stock);
        this.weightKg = weightKg;
    }

    @Override
    public double calculateDiscount(double percentage) {
        return price - (price * percentage / 100);
    }

    @Override
    public String toString() {
        return "PhysicalProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", weightKg=" + weightKg +
                '}';
    }
}
