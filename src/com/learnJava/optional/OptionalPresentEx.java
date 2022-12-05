package com.learnJava.optional;

import java.util.Optional;

public class OptionalPresentEx {



    public static void main(String[] args) {

        //isPresent
        Optional<String> stringOptional = Optional.ofNullable("not null");
        System.out.println(stringOptional.isPresent()); // true // if null false

        //ifPresent
        // you can perform additional operations if the object is present, here we just print
        // if null nothing will be printed
        stringOptional.ifPresent(s -> System.out.println(s)); // print the passed string value

    }
}
