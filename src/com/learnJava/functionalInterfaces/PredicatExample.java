package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicatExample {
    static Predicate<Integer> p = (i) -> i%2==0;
    static Predicate<Integer> p2 = (i) -> i%5==0;
    public static void predicateAnd(){
        // to pas parameter we should call test method
        System.out.println(p.and(p2).test(9)); //prdicate chaining,
    }
    public static void predicateOr(){
        // to pas parameter we should call test method
        System.out.println(p.or(p2).test(8)); //prdicate chaining,
    }
    public static void predicateNegate(){
        // to pas parameter we should call test method
        System.out.println(p.or(p2).negate().test(8)); //prdicate chaining,
    }

    public static void main(String[] args) {
        System.out.println(p.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
