package com.se4801.assignment1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        // Sample data (so the code runs)
        List<String> names = Arrays.asList("Abel", "John", "Alice", "Bob", "Andrew");

        List<Order> orders = Arrays.asList(
                new Order(50),
                new Order(150),
                new Order(200)
        );

        List<Product> products = Arrays.asList(
                new PhysicalProduct("1", "Laptop", 1000, 5, 2.5),
                new PhysicalProduct("2", "Phone", 800, 10, 1.0),
                new DigitalProduct("3", "Ebook", 50, 100, "url")
        );

        // Loop 1 — collect all names that start with 'A'
        List<String> result1 = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println("Names starting with A: " + result1);


        // Loop 2 — sum all order totals over 100
        double total = orders.stream()
                .filter(o -> o.getTotal() > 100)
                .mapToDouble(Order::getTotal)
                .sum();

        System.out.println("Total of orders > 100: " + total);


        // Loop 3 — build a map of product name → price
        Map<String, Double> priceMap = products.stream()
                .collect(Collectors.toMap(
                        Product::getName,
                        Product::getPrice
                ));

        System.out.println("Product price map: " + priceMap);


        // Loop 4 — find the most expensive product (or throw if empty)
        Product maxPriceProduct = products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);

        System.out.println("Most expensive product: " + maxPriceProduct);
    }
}


// Helper class for Loop 2
class Order {
    private double total;

    public Order(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}