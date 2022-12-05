package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DefaultMethodEx {
    /**
     * sort the list names in alphabetical order
     */

    public static void main(String[] args) {

        List<String> stringList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        //List interface has 3 default methods one called sort that takes comparator parameter
        // default method has an implementation in the interface and can be overridden in the class that implement it
        // static same but can't be overridden
        // here stringList is of type List
        stringList.sort(Comparator.naturalOrder()); //or .reverseOrder
        stringList.replaceAll(s -> s.toUpperCase()); // replaceAll is another default method

        System.out.println(stringList);
    }
}
