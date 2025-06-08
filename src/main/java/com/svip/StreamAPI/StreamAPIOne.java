package com.svip.StreamAPI;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamAPIOne {

    public static void main(String[] args) {

       /* Supplier<String> supplier=new Supplier<String>() {
            @Override
            public String get() {
                return "This is a stream API Supplier Get Methods";
            }
        };
        Consumer<String> consumer=new Consumer<String>() {


            @Override
            public void accept(String str) {

                System.out.println("Printing the Stream "+str);

            }
        };

        Stream<String> streamofStream=Stream.generate(supplier);
        streamofStream.forEach(System.out::println);




    }*/


        //this code now using Lamda Expression

        Stream.generate(()->"Hello World!").forEach(str->System.out.println("printing the String"+str));



    }
}
