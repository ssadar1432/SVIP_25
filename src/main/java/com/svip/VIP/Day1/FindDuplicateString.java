package com.svip.VIP.Day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateString {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("A");
       list.add("B");
       list.add("C");
       list.add("B");
       list.add("E");
       list.add("A");
        Set<String> set = new HashSet<String>();
        list.stream()
                .filter(n->!set.add(n)).distinct()
                .forEach(System.out::println);


    }
}
