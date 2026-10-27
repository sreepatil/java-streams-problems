package org.example.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "ball", "cat", "banana", "dog","goat");

        Map<Object, List<String>> collect1 = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect1);

        Map<Integer, List<String>> collect = words.stream()
                .collect(Collectors.groupingBy(word -> word.length()));
        System.out.println(collect);
    }
}
