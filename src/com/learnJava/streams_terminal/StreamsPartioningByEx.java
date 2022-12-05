package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartioningByEx {

    public static void partitioningBy_1(){
        Map<Boolean, List<Student>> listMap = StudentDataBase.getAllStudents().stream()
                //one argument.. predicate
                .collect(partitioningBy(student -> student.getGpa()>=3.8));
        System.out.println(listMap);
    }

    public static void partitioningBy_2(){
        Map<Boolean, Set<Student>> SetMap = StudentDataBase.getAllStudents().stream()
                //two arguments.. predicate and downstream
                .collect(partitioningBy(student -> student.getGpa()>=3.8 , toSet()));
        System.out.println(SetMap);
    }

    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();

    }
}
