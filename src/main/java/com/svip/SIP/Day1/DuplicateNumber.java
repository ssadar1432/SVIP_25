package com.svip.SIP.Day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {

    public void findUniqueNumber(){

        List<Integer> number= Arrays.asList(10,20,38,37,22,10,18,17,37);

        number.stream().distinct().forEach(System.out::println);

    }
    public void findDuplicateNumber(){
        List<Integer> number= Arrays.asList(10,20,38,37,22,10,18,17,37);

        Set<Integer> set=new HashSet<>();

          number.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);

    }

}
