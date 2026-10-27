package org.example.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningString {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        String collect = fruits.stream()
                .collect(Collectors.joining(",","(",")"));

//                .collect(Collectors.joining(",")); //O/P :-- Apple,Banana,Avocado,Mango,Apricot
        System.out.println(collect);    // O/P:-- (Apple,Banana,Avocado,Mango,Apricot)
    }
}
