package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    BiConsumer<String, List<String>> biConsumer = (name, activities) ->
            System.out.println(name + " : " + activities);

    Consumer<Student> consumer = (student ->
    {
       if(p1.and(p2).test(student)){
           biConsumer.accept(student.getName(), student.getActivities());
       }
    });

    public void namesAndActivitiesFilter(List<Student> students){
        students.forEach(consumer);
    }
    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().namesAndActivitiesFilter(students);



    }
}
