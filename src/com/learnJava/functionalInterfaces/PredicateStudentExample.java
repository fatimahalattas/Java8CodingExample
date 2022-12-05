package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    // make it here in te class to embrace code reusability
    // putting the conditions once
    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    public static void filterStudentsByGradeLevel(){
        System.out.println("prining studens filer y ad level");
        List<Student> listStudent = StudentDataBase.getAllStudents();
        listStudent.forEach((student ->
        {
            if (p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentsByGPA(){
        System.out.println("prining studens ilter b GPA >= 3.9");
        List<Student> listStudent = StudentDataBase.getAllStudents();
        listStudent.forEach((student ->
        {
            if (p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents(){
        System.out.println("prining studens filter");
        List<Student> listStudent = StudentDataBase.getAllStudents();
        listStudent.forEach((student ->
        {
            if (p1.and(p2).test(student)){
                System.out.println(student);
            }
        }));
    }
    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGPA();
        filterStudents();
    }
}
