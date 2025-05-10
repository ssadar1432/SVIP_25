package com.svip.SIP.Day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeMaxAndMin {

    public void ThreeMaxAndMin(){

        List<Integer>  integerList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        //Apply sort and Limit to get desired number
        System.out.println("Top 3 Minimumm Number ");
        integerList.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("---------------------- ");
        System.out.println("Top 3 Maximum Number ");
       integerList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
