package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StraemsFlatMapEx {

    public static List<String> studentActivities(){
        List<String> activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        return activities;
    }

    public static long studentActivitiesCount(){
        long activitiesCount = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() //Stream<String> -> distinct function performed
                .count();
        return activitiesCount;
    }
    public static void main(String[] args) {
        System.out.println(studentActivities());
        System.out.println(studentActivitiesCount());

    }
}
