package com.learnJava.numericStream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateEx {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,20).sum();
        System.out.println(sum);

       OptionalInt optionalInt = IntStream.rangeClosed(4,3).max();
        // will be print stream is empty since the range is empty
        System.out.println(optionalInt.isPresent()? optionalInt.getAsInt() : "stream is empty");

        OptionalLong optionalLong = LongStream.rangeClosed(1,50).min();
        System.out.println(optionalLong.isPresent()? optionalLong.getAsLong() : "stream is empty");

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.println(optionalDouble.isPresent()? optionalDouble.getAsDouble(): "no average");

    }
}
