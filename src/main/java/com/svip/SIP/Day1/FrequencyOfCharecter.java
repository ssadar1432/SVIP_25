package com.svip.SIP.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharecter {

    public void FrequencyOfCharecter(){

        String s="Sachin";

        Map<Character, Long> charCountMap = s.chars()
                .mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                 System.out.println(charCountMap);
    }
    public void FrequecyOfWord(){
        List<String> list= Arrays.asList("Sachin","Manoj","Arav","Manish","Sachin","Arav");

        Map<String,Long> nameCount=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("CountOfName"+nameCount);
    }
}
