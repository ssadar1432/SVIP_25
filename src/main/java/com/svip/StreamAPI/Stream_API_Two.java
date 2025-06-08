package com.svip.StreamAPI;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream_API_Two {

    public static void main(String[] args) {
        /*Consumer<Integer> consumer=new Consumer<Integer>() {

            @Override
            public void accept(Integer integerObj) {

                System.out.println(integerObj);
            }
        };*/

       /* Stream<Integer> integerStream=Stream.of(1,2,3,5,8,9,7);
        integerStream.forEach(consumer);*/

       // Stream.of(1,2,3,5,8,9,7).forEach(consumer);

        //lamda version

        Stream.of(1,2,3,5,8,9,7,9).forEach(integerObj-> System.out.println(integerObj));

    }

}
