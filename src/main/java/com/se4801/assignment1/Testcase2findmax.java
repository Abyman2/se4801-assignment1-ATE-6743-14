package com.se4801.assignment1;
import java.util.Arrays;
import java.util.List;

public class Testcase2findmax {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Orange", "Banana");

        String maxWord = GenericUtils.findMax(words);

        System.out.println("Max String: " + maxWord);
    }
}

