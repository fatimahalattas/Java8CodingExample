package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstEx {
    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                //Adam
                //Jenny
                //Emily
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                //Adam
                //Jenny
                //Emily
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> findAnyStudent = findAnyStudent();
        if(findAnyStudent.isPresent()){
            System.out.println(findAnyStudent().get());
        }else {
            System.out.println("No match");
        }
        // both shows the same result, will show the difference in parallel mode(cover later)
        Optional<Student> findFirstStudent = findFirstStudent();
        if(findFirstStudent.isPresent()){
            System.out.println("Find First" + findFirstStudent().get());
        }else {
            System.out.println("No match");
        }

    }
}
