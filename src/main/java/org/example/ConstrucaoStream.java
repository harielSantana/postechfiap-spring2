package org.example;

import java.util.stream.Stream;

public class ConstrucaoStream {
    public static void main(String[] args) {
        Stream<Number> number = Stream.of(10,10,10,20,12,3,9,5);
        number.forEach(System.out::println);

        System.out.println("**********<hr/>**********");


    }   
}

