package com.learnJava.optional;

import com.learnJava.data.Bike;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapEx {

    //filter
    public static void OptionalFilter (){
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent.filter(student -> student.getGpa()>=4.0)
                .ifPresent(student -> System.out.println(student));
    }

    //Map
    public static void OptinalMap(){
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (optionalStudent.isPresent()){
          Optional<String> stringOptional = optionalStudent
                  .filter(student -> student.getGpa()>=2.5)
                  .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    //flatMap
    public static void flatMapOptional() {
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (optionalStudent.isPresent()) {
            Optional<String> stringOptional = optionalStudent
                    .filter(student -> student.getGpa() >= 2.5)
                    .flatMap(Student::getBike)
                    .map(Bike::getName);
            stringOptional.ifPresent(s -> System.out.println(s));
        }
    }

    public static void main(String[] args) {

        OptionalFilter();
        OptinalMap();

    }
}
