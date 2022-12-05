package com.learnJava.defaults;

// Multible Inhertince concept
public class Interface123Client implements Interface1, Interface2, Interface3 {

    public void methodA (){
        System.out.println("Inside method A " + Interface123Client.class);
    }

    public static void main(String[] args) {

        Interface123Client interface123Client = new Interface123Client();
        // "methodA" has been overriden in two placec
        // 1. in this class (implements its interface) - will call it in this place
        // 2. in the interface2 (child of Interface1) - second priority
        interface123Client.methodA();
        interface123Client.methodB();
        interface123Client.methodC();

    }
}
