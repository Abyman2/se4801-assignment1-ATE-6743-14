package com.se4801.assignment1;

public class TestProduct {

    public static void main(String[] args) {

        PhysicalProduct p1 = new PhysicalProduct("1", "Laptop", 1000, 5, 2.5);
        DigitalProduct p2 = new DigitalProduct("2", "Ebook", 50, 100, "http://download.com");

        System.out.println(p1);
        System.out.println("Discounted price: " + p1.calculateDiscount(10));

        System.out.println(p2);
        System.out.println("Discounted price: " + p2.calculateDiscount(10));
    }
}
