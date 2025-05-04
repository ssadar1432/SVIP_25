package com.svip.VIP.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartWithNumber {

    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,45,2,3,1,5,11,15,22,33,45);

        List<Integer> number=list.stream()
                .filter(num->String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(number);

        //second way
        System.out.println("=====================================================");
        List<Integer> stnum=list.stream().filter(num->(""+num).startsWith("2")).collect(Collectors.toList());
        stnum.forEach(num->System.out.println(num));

    }
}
