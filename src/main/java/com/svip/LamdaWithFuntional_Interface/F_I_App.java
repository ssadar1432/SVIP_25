package com.svip.LamdaWithFuntional_Interface;

public class F_I_App {

    public static void main(String[] args) {

        F_I_TwoParamter inter=(a,b)-> System.out.println("The sum of Two Number :"+(a+b));
        inter.add(100,300);
    }
}
