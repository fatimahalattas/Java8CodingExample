package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipEx {

    public static Optional<Integer> sumofFirst3 (List<Integer> integerList){
        return integerList.stream()
                .limit(3)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> sumoflast2 (List<Integer> integerList){
        return integerList.stream()
                .skip(3)
                .reduce((a,b)->a+b);
                //.reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        //List<Integer> integerList = Arrays.asList();
        System.out.println(sumoflast2(integerList));

        Optional<Integer> skipVal = sumoflast2(integerList);
        if(skipVal.isPresent()){
            System.out.println(sumoflast2(integerList));
        }else {
            System.out.println("list is empty");
        }
    }
}
