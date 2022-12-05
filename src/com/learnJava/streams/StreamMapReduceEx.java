package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamMapReduceEx {

    public static int totalNotebooks (){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks)
                //.reduce(0,(integer, integer2) -> integer+integer2);
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(totalNotebooks());

    }
}
