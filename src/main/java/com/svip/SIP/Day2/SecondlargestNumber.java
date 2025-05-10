package com.svip.SIP.Day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondlargestNumber {

    public void secondLargestNumber(){

        List<Integer> integerList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int SecondLargerst=integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Largest Number = "+SecondLargerst);
    }
}
