package com.learnJava.methodReference;

import java.util.function.Function;

public class FaunctionMethodReferenceEx {
    static Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();

    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("lambda"));
        System.out.println(toUpperCaseMethodReference.apply("Mthod reference"));



    }
}
