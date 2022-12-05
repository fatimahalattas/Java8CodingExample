package com.learnJava.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamEx {



    public static int sequentialSum(){
        return IntStream.rangeClosed(1,100000)
                .sum();
    }

    public static int parallelSum(){
        return IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
    }

    public static long timePerformance(Supplier<Integer> supplier, int numOfTimes){
        long currentTime = System.currentTimeMillis();

        for (int i = 0; i< numOfTimes; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-currentTime;
    }

    public static void main(String[] args) {

        System.out.println("sequential sum: " + timePerformance(ParallelStreamEx::sequentialSum,20));
        System.out.println("parallel sum: " + timePerformance(ParallelStreamEx::parallelSum,20));

        System.out.println(Runtime.getRuntime().availableProcessors());


    }
}
