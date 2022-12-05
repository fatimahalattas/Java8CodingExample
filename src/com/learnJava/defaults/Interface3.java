package com.learnJava.defaults;

public interface Interface3 {

    default void methodC (){
        System.out.println("Inside method C " + Interface3.class);
    }
}
