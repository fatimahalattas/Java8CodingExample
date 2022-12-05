package com.learnJava.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapEx {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
    }

    public static long mapToLong(){
         return IntStream.rangeClosed(1,5)
                 // i is passed from intstream
                .mapToLong((i)-> i)
                 //convert intstream to longstream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                // i is passed from intstream
                .mapToDouble((i)-> i)
                //convert intstream to Doublestream
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("mapToObj " + mapToObj());
        System.out.println(mapToLong());

        System.out.println(mapToDouble());

    }
}
