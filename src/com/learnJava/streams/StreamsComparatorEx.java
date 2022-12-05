package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorEx {

    public static List<Student> sortedStudentNames(){
        List<Student> students = StudentDataBase.getAllStudents().stream() //Stream(Student>
                .sorted(Comparator.comparing(Student::getName).reversed()) //Stream(Student>
                .collect(Collectors.toList()); //List<Student>
        return students;
    }
    public static void main(String[] args) {
        sortedStudentNames().forEach(System.out::println);
    }
}
