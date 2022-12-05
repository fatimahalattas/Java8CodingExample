package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        // lambda to implement comparator functional interface
        // compare 2 integers, 0 if equal, -1 a<b, 1 a>b
        Comparator<Integer> comparableLambda = (a, b) -> a.compareTo(b);
        System.out.println(comparableLambda.compare(3,2));
    }
}
