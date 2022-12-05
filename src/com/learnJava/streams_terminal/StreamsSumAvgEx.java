package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgEx {

    public static int totalNotebooks (){
        return StudentDataBase.getAllStudents().stream()
                .collect(summingInt(Student::getNotebooks));
    }

    public static double average (){
        return StudentDataBase.getAllStudents().stream()
                .collect(averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println(totalNotebooks());
        System.out.println(average());
    }
}
