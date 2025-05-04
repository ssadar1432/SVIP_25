package com.svip.VIP.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,5,8,9,3,4,5,11);
        boolean containPrime = number.stream()
                .anyMatch(element -> isPrime(element));

        System.out.println("Array contains prime number: " + containPrime);
        System.out.println("-------Priting Prime Number-------");
        number.stream()
                .filter(CheckPrimeNumber::isPrime)
                .forEach(System.out::println);

    }
    public static boolean isPrime(int num) {

        if(num<1) return false;

        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
