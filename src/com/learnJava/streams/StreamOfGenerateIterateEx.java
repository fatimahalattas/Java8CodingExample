package com.learnJava.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateEx {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Fatimah", "Alattas", "Working Hardly");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x->x*2)
                .limit(5) // to stop the infinite method
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5) // to stop the infinite method
                .forEach(System.out::println);
    }
}
