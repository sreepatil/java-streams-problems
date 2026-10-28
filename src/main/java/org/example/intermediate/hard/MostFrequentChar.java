package org.example.intermediate.hard;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentChar {
    public static void main(String[] args) {
        String input = "banana";

        Optional<Map.Entry<Character, Long>> max = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(max.get());
    }
}
