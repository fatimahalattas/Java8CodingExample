package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsMapEx {
        public static List<String> nameList (){
            return StudentDataBase.getAllStudents().stream() //Stream<Student>
                    //Student as an input -> Student name
                    .map(Student::getName) //Stream<String> // map here converting the whole type
                    .map(String::toUpperCase) // Stream<String> // upperCase operation on each input
                    .collect(toList()); //List<String>
        }
    public static void main(String[] args) {
        System.out.println(nameList());
    }
}
