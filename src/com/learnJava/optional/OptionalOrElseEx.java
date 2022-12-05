package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseEx {

    //orElse
    public static String orElseOptional(){
        //since the ofNullable takes an object of type student, so we need to store it in a variable with same type
        //Optional<Student>
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // will execute orElse when we pass null value for the ofNullable
        // which return Option.empty
        // so the value is empty no student name, then will print default
        return studentOptional.map(Student::getName).orElse("Default");
    }

    //orElseGet
    public static String orElseGetOptional(){
        //since the ofNullable takes an object of type student, so we need to store it in a variable with same type
        //Optional<Student>
        Optional<Student> studentOptional = Optional.ofNullable(null);
        // orElseGet takes supplier - which takes no input and return an output
        return studentOptional.map(Student::getName).orElseGet(()->"Default");
    }
    // orElseThrow
    public static String orElseThrowOptional(){
        //since the ofNullable takes an object of type student, so we need to store it in a variable with same type
        //Optional<Student>
        Optional<Student> studentOptional = Optional.ofNullable(null);
        // orElseThrow takes supplier which return an exception
        return studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No data available"));
    }

    public static void main(String[] args) {
        System.out.println(orElseThrowOptional());

    }
}
