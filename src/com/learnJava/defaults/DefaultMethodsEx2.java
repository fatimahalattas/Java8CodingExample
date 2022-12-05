package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsEx2 {

    // define it in the class level to be able to reuse it
    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Comparator<Student> nameComparatore = Comparator.comparing(Student::getName);
   static Comparator<Student> gradeComparatore = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName (List<Student> studentList){
        System.out.println("After sort by name: ");
        //Comparator<Student> nameComparatore = Comparator.comparing(Student::getName);
        studentList.sort(nameComparatore);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGPA (List<Student> studentList){
        System.out.println("After sort by GPA: ");
        Comparator<Student> GPAComparatore = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(GPAComparatore.reversed());
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChain(List<Student> studentList){
        System.out.println("After sorting by grade then Name: ");
        studentList.sort(gradeComparatore.thenComparing(nameComparatore));
        studentList.forEach(studentConsumer);

    }

    public static void  sortWithNull (List<Student> studentList){
        // when we have null values in the list we can use method called nullsLast
        // which sort the nulls values to the last
        // or nullsFirst
       Comparator<Student> studentComparator = Comparator.nullsLast(nameComparatore);
       studentList.sort(studentComparator);
       studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sorting : ");
        studentList.forEach(studentConsumer);

        //sortByName(studentList);
        //sortByGPA(studentList);
        //comparatorChain(studentList);
        sortWithNull(studentList);
    }
}
