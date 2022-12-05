package com.learnJava.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingEx {

    public static List<Integer> boxing (){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }
    public static int unBoxing(List<Integer> integerList){
       return integerList.stream()
                .mapToInt(Integer::intValue)
               //output: Intstream(intValue of the wrapper class) -- means after converting from wrapper to primitive
                .sum();
                //if we wnat to print the int stream, and the method will be void
                //.forEach(i-> System.out.print(i+ ", "));

    }
    public static void main(String[] args) {
        System.out.println("boxing " + boxing());
        System.out.println();
        List<Integer> integerList = boxing();
        System.out.println(unBoxing(integerList));

    }
}
