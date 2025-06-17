package com.svip.LamdaWithFuntional_Interface;

public class ThreadRunableExample {

    public static void main(String[] args) {

        Runnable runnable = ()->{
            for(int i=0; i<10; i++){
                System.out.println("This is a child thread runnable example");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i=0; i<10; i++){
            System.out.println("This is a Main thread runnable example");
        }

    }
}
