package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalEx {

    public static String getStudentName(){

        // Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return  student.getName();
        }else{
            return  null;
        }
    }

    public static Optional<String> getStudentNameOptional(){

        // wrap the actual student object inside optional object
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null); // Optional.empty

        if(student.isPresent()){ // checking if optional object have a value of student object using isPresent
            return  student.map(Student::getName); // don't get confused this with streams map method. Both are different.
        }
        return Optional.empty(); // represents an optional object with no value
    }

    public static void main(String[] args) {

        if(getStudentNameOptional().isPresent()){
            System.out.println(getStudentNameOptional().get().length()); // String which is student name
        }else{
            System.out.println("Name is returned as empty.");
        }
    }
}
