package com.svip.VIP.Day1;

import java.util.stream.Collectors;

public class SortString {

    public  void stringSort(String input) {

        String sortedString = sortString(input);
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }

    public static String sortString(String input) {
        // Convert the string to a stream of characters, sort it, and collect it back to a string
        return input.chars() // Create an IntStream of characters
                .sorted() // Sort the characters
                .mapToObj(c -> (char) c) // Convert int to Character
                .map(String::valueOf) // Convert Character to String
                .collect(Collectors.joining()); // Join the sorted characters into a single string
    }
}


