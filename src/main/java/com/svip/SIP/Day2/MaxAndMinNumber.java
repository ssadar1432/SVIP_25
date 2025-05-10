package com.svip.SIP.Day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {


public void maxAndMinNumber(){

    List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

    int max=listOfIntegers.stream().max(Comparator.naturalOrder()).get();
    System.out.println("Maximum Number is "+max);

    int min=listOfIntegers.stream().min(Comparator.naturalOrder()).get();
    System.out.println("Maximum Number is "+min);

}
}
