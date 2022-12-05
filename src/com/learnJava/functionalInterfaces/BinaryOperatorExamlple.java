package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExamlple {
    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
        System.out.println(binaryOperator.apply(3,5));

        BinaryOperator<Integer> max = BinaryOperator.maxBy(comparator);
        System.out.println(max.apply(4,2));
        BinaryOperator<Integer> min = BinaryOperator.minBy(comparator);
        System.out.println(min.apply(4,2));

    }
}
