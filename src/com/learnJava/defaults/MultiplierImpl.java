package com.learnJava.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{
    @Override
    public int Multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(x,y) -> x*y);
    }

    public int size (List<Integer> integerList){
        System.out.println("default method inside MultiplierImpl class");
        return integerList.size()+1;
    }
}
