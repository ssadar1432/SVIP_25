package com.svip.SIP.Day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateName {

    public void UniqueNameFromList(){

        List<String> list= Arrays.asList("Sachin","Manoj","Arav","Manish","Sachin");

        List<String> unique= list.stream().distinct().collect(Collectors.toList());
        System.out.println(" Unique name From Given List"+unique);

    }

    public void DuplicateNameFromList(){
        List<String> list= Arrays.asList("Sachin","Manoj","Arav","Manish","Sachin");
        Set<String> set=new HashSet<>();
        List<String> duplicate=  list.stream().filter(e-> !set.add(e)).collect(Collectors.toList());
        System.out.println(" Duplicate name From Given List"+duplicate);
    }
}
