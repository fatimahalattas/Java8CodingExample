package com.learnJava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableEx {

    public static Optional<String> ofNullable(){
        return Optional.ofNullable(null); // calling the method with null will return empty optional object
        // no value so can't call .get without checking by using .isPresent

    }

    public static Optional<String> of(){
        // of will always expect you to have valid value for the input - no null
        return Optional.of("Valid input");

    }

    public static Optional<String> empty(){
        // if you have an Optional method type, in exception you can return empty optional
        // which is the same type as the method return type
        return Optional.empty();

    }

    public static void main(String[] args) {

        System.out.println(empty());

    }
}
