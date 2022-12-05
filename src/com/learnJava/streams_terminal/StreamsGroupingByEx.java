package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByEx {

    public static Map<String, List<Student>> groupingBy_1(){
        return StudentDataBase.getAllStudents().stream()
                //classofier
                .collect(groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> customizedGroupingBy_1(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa()>=3.9? "Outstanding" : "Average"));
    }

    public static Map<Integer, Map<String,List<Student>>> groupingBy_2(){
        return StudentDataBase.getAllStudents().stream()
                //two arguments, classifier and downstream
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >=3.9? "Outstanding" : "Average")));
    }

    public static Map<Integer,Integer> groupingBy_2_2(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, summingInt(Student::getNotebooks)));
    }

    public static void threeArgumentsGroupingBy_3(){
        LinkedHashMap<String, Set<Student>> linkedHashMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,LinkedHashMap::new,toSet()));
        System.out.println(linkedHashMap);
    }

    public static Map<Integer, Optional<Student>> topGPAStudentPerGradeLevel(){
        return StudentDataBase.getAllStudents().stream()
                //two arguments version
                .collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparing(Student::getGpa))));
    }

    // to avoid the list of students being wrapped in Optional
    public static Map<Integer, Student> topGPAStudentPerGradeLevel2(){
        return StudentDataBase.getAllStudents().stream()
                //two arguments version
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }

    public static Map<Integer, Student> leastGPAStudentPerGradeLevel(){
        return StudentDataBase.getAllStudents().stream()
                //two arguments version
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }




    public static void main(String[] args) {
        //System.out.println(groupingBy_1());
        //System.out.println(customizedGroupingBy_1());
        // System.out.println(groupingBy_2());
       // System.out.println(groupingBy_2_2());
       // threeArgumentsGroupingBy_3();
        System.out.println(topGPAStudentPerGradeLevel2());
        System.out.println(leastGPAStudentPerGradeLevel());
    }
}
