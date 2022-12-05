package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentPredicate2 = (student -> student.getGpa()>=3.9);
        // student names activitis in a map with filter
        Map<String, List<String>> namesActivties =
                StudentDataBase.getAllStudents().stream()
                        .filter(studentPredicate)
                        .filter(studentPredicate2)
                        .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(namesActivties);

    }
}
