package com.se4801.assignment1;

import java.util.*;

public class FindMaxExample {

    public static void main(String[] args) {

        // Test case (a): Integers
        List<Integer> numbers = List.of(10, 25, 3, 99, 50);
        System.out.println("Max Integer: " + findMax(numbers));

        // Test case (b): Strings
        List<String> words = List.of("banana", "apple", "cherry");
        System.out.println("Max String: " + findMax(words));
    }

    public static <T extends Comparable<T>> T findMax(List<T> list) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        T max = list.get(0);

        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }
}