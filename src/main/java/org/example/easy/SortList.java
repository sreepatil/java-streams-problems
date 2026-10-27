package org.example.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,5,1,5, 1, 8, 3, 2, 10);

        List<Integer> aseOrder = numbers.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println("Ascending Order : " + aseOrder);

        List<Integer> descOrder = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Descending Order : " + descOrder);


    }
}
