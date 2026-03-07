package com.se4801.assignment1;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaxTest {

    @Test
    void testIntegerMax() {

        List<Integer> numbers = Arrays.asList(3, 8, 2, 10, 5);

        Integer max = GenericUtils.findMax(numbers);

        assertEquals(10, max);
    }

    @Test
    void testStringMax() {

        List<String> words = Arrays.asList("Apple", "Orange", "Banana");

        String max = GenericUtils.findMax(words);

        assertEquals("Orange", max);
    }
}