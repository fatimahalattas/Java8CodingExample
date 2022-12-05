package com.learnJava.lambdas;

public class RunnableLambdaExample  {
    public static void main(String[] args) {
        // Java 8 lambda
        // () -> {} -
        // if it is a single statement no need for {}

        Runnable runnableLambda = () ->
                System.out.println("Inside runnable 2");
        new Thread(runnableLambda).start();
        // if you don't want to assign it to a variable
        new Thread (()->
                System.out.println("Inside runnable 3")).start();

    }
}
