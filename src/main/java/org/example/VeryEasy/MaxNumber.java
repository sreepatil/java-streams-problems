package org.example.VeryEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> max = numbers.stream()
                .reduce( Integer::max);

        System.out.println("Maximum No in list is : " + max.get());

        Optional<Integer> min = numbers.stream()
                .reduce( Integer::min);

        System.out.println("Minimum No in list is : "+ min.get());
    }
}
