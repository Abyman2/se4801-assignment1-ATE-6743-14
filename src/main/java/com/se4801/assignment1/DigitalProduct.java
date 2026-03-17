package com.se4801.assignment1;

public class DigitalProduct extends Product {

    private String downloadUrl;

    public DigitalProduct(String id, String name, double price, int stock, String downloadUrl) {
        super(id, name, price, stock);
        this.downloadUrl = downloadUrl;
    }

    @Override
    public double calculateDiscount(double percentage) {
        return price - (price * (percentage + 5) / 100);
    }

    @Override
    public String toString() {
        return "DigitalProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", downloadUrl='" + downloadUrl + '\'' +
                '}';
    }
}