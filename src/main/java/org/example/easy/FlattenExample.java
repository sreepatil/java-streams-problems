package org.example.easy;

import java.util.Arrays;
import java.util.List;

public class FlattenExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> list = listOfLists.stream()
                .flatMap(n -> n.stream())
                .distinct()
                .toList();

        System.out.println(list);
    }
}
