package org.example.intermediate.hard;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharStream {
    public static void main(String[] args) {
        String str = "swiss";

        LinkedHashMap<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,    // it will maintain the insertion order, map not maintain insertion
                        Collectors.counting()));

        Optional<Map.Entry<Character, Long>> first = collect.entrySet().stream()
                .filter(ch -> ch.getValue() == 1)
                .findFirst();
        System.out.println(first.get());
    }
}
