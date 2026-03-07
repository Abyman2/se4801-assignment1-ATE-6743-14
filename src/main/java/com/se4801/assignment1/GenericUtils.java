package com.se4801.assignment1;

import java.util.List;

public class GenericUtils {

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