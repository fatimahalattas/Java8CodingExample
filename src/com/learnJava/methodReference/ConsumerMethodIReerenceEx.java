package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerMethodIReerenceEx {

    static Consumer<Student> consumerLambda = p -> System.out.println(p);
    static Consumer<Student> consumerMethodRef = System.out::println;
    static Consumer<Student> studentConsumer = Student::printActivities;

    static Predicate<Student> predicate = student -> student.getActivities().contains("gymnastics");
    static Consumer<Student> consumer = student -> {
        if (predicate.test(student)){
            System.out.println(student.getActivities());
        }
    };

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumerMethodRef);
        StudentDataBase.getAllStudents().forEach(studentConsumer);
        System.out.println("only gym");
        StudentDataBase.getAllStudents().forEach(consumer);

    }
}
