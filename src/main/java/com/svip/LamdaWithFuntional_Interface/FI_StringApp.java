package com.svip.LamdaWithFuntional_Interface;

public class FI_StringApp {

    public static void main(String[] args) {
        FI_String strFI=s-> s.length();
        System.out.println(strFI.getLength("Vidyadhar"));
        System.out.println(strFI.getLength("With Lamda Expression "));

    }
}
