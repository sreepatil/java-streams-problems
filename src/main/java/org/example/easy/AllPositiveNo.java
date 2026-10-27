package org.example.easy;

import java.util.Arrays;
import java.util.List;

public class AllPositiveNo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 3, 8, 2);

        boolean match = numbers.stream()
                .allMatch(n -> n > 0);

        System.out.println(match); //True if all +ve else if any -ve occur false
    }
}
