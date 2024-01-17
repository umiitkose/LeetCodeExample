package com.umiitkose.date.easy;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Quiz1360 {

    public int daysBetweenDates(String date1, String date2) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate firstDate = LocalDate.parse(date1, format);
        LocalDate secondDate = LocalDate.parse(date2, format);

        return Math.abs((int) ChronoUnit.DAYS.between(firstDate, secondDate));
    }

}
