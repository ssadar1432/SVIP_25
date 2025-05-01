package com.svip.SIP.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

public void FindEvenNumber(){
    List<Integer> number= Arrays.asList(10, 20, 30, 33, 23, 45, 1, 17, 7, 9);
                  number.stream()
                        .filter(e->e%2 == 0)
                        .forEach(System.out::println);
}
}
