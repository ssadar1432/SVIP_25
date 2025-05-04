package com.svip.VIP.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    //remove the duplicate and preserve the order
    public static void main(String[] args) {

    List<String> list= Arrays.asList("Apple","Banana","Apple","organge","Banana");

    list.stream().distinct().forEach(System.out::println);

    //jst remove duplicate
        System.out.println("Just printing duplicate not presevers insertion order ");
        list.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }

}
