package org.example.hard.hard;

import org.example.hard.hard.enums.CharCategory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingCharacters {
    public static void main(String[] args) {

        List<Character> chars = Arrays.asList(
                'A', 'b', '3', 'Z', 'x', '#', '7', 'm', '@'
        );

        Map<Object, List<Character>> collect = chars.stream()
                .collect(Collectors.groupingBy(
                        ch -> getCharecterCategory(ch.charValue())
                ));

        System.out.println(collect);
    }

    private static Object getCharecterCategory(char c) {
        if (Character.isUpperCase(c)) return CharCategory.UPPERCASE;
        if (Character.isLowerCase(c)) return CharCategory.LOWERCASE;
        if (Character.isDigit(c)) return CharCategory.DIGIT;
        else return CharCategory.OTHER;
    }
}
