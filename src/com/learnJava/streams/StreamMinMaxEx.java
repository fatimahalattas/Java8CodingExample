package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxEx {

    private static Optional<Integer> maxInt (List<Integer> integerList){
       return integerList.stream()
               .reduce((a,b) -> a>b? a:b);
               // .reduce(Integer::max); // never pass identity value to find max, min value in stream
        // bc if it is empty list it should not return any value rather than return the default passed value
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        //List<Integer> integerList = Arrays.asList();

        Optional<Integer> optionalInteger = maxInt(integerList);
        if(optionalInteger.isPresent()){
            System.out.println(optionalInteger.get());
        } else {
            System.out.println("it is empty");
        }
    }
}
