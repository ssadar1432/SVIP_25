package com.svip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddOrEven {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,12,25,14,3,5,6,7,17,18,20);

        List<Integer> odd=list.stream().filter(num->num%2!=0).collect(Collectors.toList());

        List<Integer> even=list.stream().filter(num->num %2==0).collect(Collectors.toList());
        System.out.println("printing Even numbers : "+even);
        System.out.println("===========================================================");
        System.out.println("printing Odd numbers : "+odd);

    }
}
