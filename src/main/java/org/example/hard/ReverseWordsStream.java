package org.example.hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsStream {
    public static void main(String[] args) {
        String sentence = "Java streams are powerful";

        String collect = Arrays.stream(
                        sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println("Using internal methods : " + collect);

        // Without any method

        String collect1 = Arrays.stream(
                        sentence.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (rev, ch) -> ch + rev))
                .collect(Collectors.joining(" "));

        System.out.println("Without internal method : " + collect1);
    }
}
