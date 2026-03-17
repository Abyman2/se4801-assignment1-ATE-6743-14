package com.se4801.assignment1;
import java.util.Arrays;
import java.util.List;

public class Testcase1findmax {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 10, 5, 8);

        Integer maxNumber = GenericUtils.findMax(numbers);

        System.out.println("Max Integer: " + maxNumber);
    }
}

