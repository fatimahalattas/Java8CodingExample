package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    // first parameter is input, sec is output
    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function <String,String> function1 = (name) -> name.toUpperCase().concat(" default");

    static Function<List<Student>, Map <String, Double>> StudentGrade = (students ->
    {
        Map<String,Double> map = new HashMap<>();
        students.forEach((student -> {
            // reuse code of Predicate from PredicateStudentExample
            // to filter students whose gradeLevel >= 3
            if (PredicateStudentExample.p1.test(student)) {
                map.put(student.getName(), student.getGpa());
            }
        }));
        return map;
    });
    public static void main(String[] args) {
        System.out.println("apply result is " + function.apply("Fatimah") );
        // FATIMAH default
        System.out.println("and then result is " + function.andThen(function1).apply("Fatimah"));
        // FATIMAH DEFAULT
        System.out.println("Compose result is " + function.compose(function1).apply("Fatimah"));
        System.out.println(StudentGrade.apply(StudentDataBase.getAllStudents()));



    }
}
