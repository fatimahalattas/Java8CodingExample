package com.learnJava.numericStream;

import java.util.stream.IntStream;

public class NumericStreamsRangesEx {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,50); //50 excluded
        System.out.println("range 1-50 count is " + intStream.count());
        IntStream.range(1,50).forEach((i) -> System.out.print(i + ", "));
        System.out.println();
        IntStream intStream2 = IntStream.rangeClosed(1,50); // 50 included
        System.out.println("rangeClosed 1-50 count is " + intStream2.count());
        IntStream.rangeClosed(1,50).forEach((i) -> System.out.print(i + ", "));
        System.out.println();
        System.out.println("as Double Stream");
        IntStream.range(1,50).asDoubleStream().forEach(i-> System.out.print(i+ ", "));


    }
}
