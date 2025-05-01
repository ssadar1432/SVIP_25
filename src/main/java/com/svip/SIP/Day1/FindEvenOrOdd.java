package com.svip.SIP.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOrOdd {

    public void  EvenOrOddList() {
        List<Integer> number = Arrays.asList(10, 20, 30, 33, 23, 45, 1, 17, 7, 9);

        List<Integer> evenNumber = number
                .stream()
                .filter(e -> e % 2 == 0).collect(Collectors.toList());
        List<Integer> OddNumber = number
                .stream()
                .filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println("Even Number" + evenNumber);
        System.out.println("--------------------");
        System.out.println("Odd Number" + OddNumber);

    }
}
