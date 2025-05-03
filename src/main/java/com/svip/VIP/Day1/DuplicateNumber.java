package com.svip.VIP.Day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

    public static void main(String[] args) {

        List<Integer> al= Arrays.asList(1,4,5,6,8,9,1,4,22,5);
        Set<Integer> set=new HashSet<>();
        al.stream()
                .filter(n->!set.add(n))
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}
