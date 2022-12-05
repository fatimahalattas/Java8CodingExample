package com.learnJava.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateEx {
    // convert from string to localDate

    public static void parseLocalDate(){
    /**
     * Using system defined format
     */
    String date = "2018-04-28";
    LocalDate localDate0 =  LocalDate.parse(date);
        System.out.println("localDate0 : " + localDate0);
    LocalDate localDate = LocalDate.parse(date,DateTimeFormatter.ISO_LOCAL_DATE); //ISO_DATE is the same
        System.out.println("localDate " + localDate);

    String isoDate = "20180428";
        System.out.println("BASIC_ISO_DATE : " +LocalDate.parse(isoDate,DateTimeFormatter.BASIC_ISO_DATE));


    /**
     * Custom system defined format
     */
    String date1 = "2018|04|28";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
    LocalDate localDate1 = LocalDate.parse(date1,dateTimeFormatter);
        System.out.println("localDate1 : " + localDate1);
    // can't use # and some other sympols as mentioned in the documentation as it is reserved words
    String date2 = "2018*04*28";
    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("uuuu*MM*dd");
    LocalDate localDate2 = LocalDate.parse(date2,dateTimeFormatter1);
        System.out.println("localDate2 : " + localDate2);
}
    // convert from localDate to a String
    public static void formatLocalDate(){
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd|MM|yyyy");
        // capital MM represents month, small mm represents minutes
        // list os symplos also exist in the documintation
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate : " + formattedDate);

    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();

    }

}
