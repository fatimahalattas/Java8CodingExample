package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void printNamesAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name +
                " : " + activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> biConsumer.accept(student.getName(), student.getActivities())));
    }

    public static void main(String[] args) {
        printNamesAndActivities();
    }
}
