package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReEx {
    static Predicate<Student> predicate = RefactorMethodReEx::greaterThanGadeLevel;
    public static boolean greaterThanGadeLevel(Student s){
        return s.getGradeLevel()>=3;
    }
    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));
    }
}
