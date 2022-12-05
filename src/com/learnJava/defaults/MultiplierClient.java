package com.learnJava.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);
        System.out.println(multiplier.Multiply(integerList));
        // size is a default method in the interface
        // it has been overridden by the implementaion class (size +1)
        // so when we call it here it will call the one inside the impl class
        System.out.println(multiplier.size(integerList));
        // isEmpty is a static method in the interface which can't be overridden
        // also to call a static method, we should call it by the class name
        System.out.println(Multiplier.isEmpty(integerList));

    }
}
