package com.learnJava.defaults;

// since both of the interfaces have the same exaxt metod name
// compiler get conflict
public class Client14 implements Interface1,Interface4 {

    // to resolve the conflict we need to have an implementation in theis class - that implemets them
    public void methodA (){
        System.out.println("Inside method A " + Client14.class);
    }

    public static void main(String[] args) {

        Client14 client14 = new Client14();
        client14.methodA();

    }
}
