package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningEx {
    public static String joiningNames1 (){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining());
    }

    public static String joiningNames2 (){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-"));
    }

    public static String joiningNames3 (){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println(joiningNames1());
        System.out.println(joiningNames2());
        System.out.println(joiningNames3());
    }
}
