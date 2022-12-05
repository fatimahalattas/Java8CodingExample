package com.learnJava.numericStream;

import java.util.stream.IntStream;

public class NumericStreamsEx {

    public static int sumOfNumIntStream(){
        return IntStream.rangeClosed(1,6)
                //1
                //2
                //3
                //4
                //5
                //6
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumIntStream());

    }
}
