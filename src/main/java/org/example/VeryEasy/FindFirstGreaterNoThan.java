package org.example.VeryEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstGreaterNoThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 12, 5, 11, 20);

        Optional<Integer> first = numbers.stream()
                .filter(n -> n > 10)
                .sorted()
                .findFirst();

        System.out.println(first.get());     //without get O/P -> Optional[11]
    }
}
