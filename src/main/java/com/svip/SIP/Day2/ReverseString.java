package com.svip.SIP.Day2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public void reverseString(){

        String name="Sachin Sadar";
        System.out.println("Original String = "+name);
      String reverse= Stream.of(name).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println("Reverse String = "+reverse);
    }
}
