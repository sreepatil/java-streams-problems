package org.example.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopThreeFrequentWords {
    public static void main(String[] args) {
        String paragraph = "Java is great great is. Java is object oriented. Java streams are powerful, and Java is fun!";

        Map<String, Long> collect = Arrays.stream(
                paragraph.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        List<Map.Entry<String, Long>> sorted = collect.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .toList();

        List<Long> topFrequency = sorted.stream()
                .map(Map.Entry::getValue)
                .distinct()
                .limit(3)
                .toList();

        List<Map.Entry<String, Long>> list2 = sorted.stream()
                .filter(e -> topFrequency.contains(e.getValue()))
                .toList();

        System.out.println(list2);

    }
}
