package org.example.hard.hard;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {
    public static void main(String[] args) {

        String paragraph = "Java is great and Java is fun. Java is powerful!";

        String[] word = paragraph.toLowerCase().replaceAll("[^a-z\\s]", "")
                .split(" ");

        List<String> list = IntStream.range(0, word.length - 1)
                .mapToObj(i -> word[i] + " " + word[i + 1])
                .toList();

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
