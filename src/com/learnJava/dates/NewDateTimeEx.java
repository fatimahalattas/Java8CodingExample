package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeEx {

    public static void main(String[] args) {
        //localDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date: " + localDate);
        //localTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time: " + localTime);
        //localDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local DateTime: " + localDateTime);
    }
}
