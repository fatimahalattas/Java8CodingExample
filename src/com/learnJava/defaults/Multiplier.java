package com.learnJava.defaults;

import java.util.List;

public interface Multiplier {
    // a regular interface method with no implementation
    int Multiply (List<Integer> integerList);

    // default method with implementation and overridden by the impl class
    default int size (List<Integer> integerList){
        System.out.println("default method inside interface");
        return integerList.size();
    }

    // static method with implementation, can't be overridden
    static boolean isEmpty (List<Integer> integerList){
       return integerList != null && integerList.size() > 0;
    }

}
