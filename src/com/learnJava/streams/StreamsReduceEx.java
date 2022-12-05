package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsReduceEx {

    public static int multiblication(List<Integer> integers) {
        return integers.stream()
                //1
                //3
                //5
                //7
                //a=1(default or identity-first parameter in reduce), b=1(from the above stream = 1
                //a=1(result of reduce), b=3(from Stream) = 3
                //a=3, b= 5 = 15
                // a= 15, b = 7 = 105
                .reduce(1, ((integer, integer2) -> integer * integer2));
    }

    public static Optional<Student> hiegestGPA (){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .reduce((student, student2) ->  student);
    }


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);

        System.out.println(multiblication(integers));

        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Heighest GPA " + hiegestGPA());

    }
}