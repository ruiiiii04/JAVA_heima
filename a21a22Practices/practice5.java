package com.itheima.a21a22Practices;

import java.time.LocalDate;
import java.util.Calendar;

public class practice5 {
    public static void main(String[] args) {
        //jdk7
        Calendar c = Calendar.getInstance();
        c.set(2000, Calendar.MARCH,1);    //月份的范围0~11；
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);



        //jdk8
        LocalDate ld = LocalDate.of(2000,3,1);
        LocalDate ld2 = ld.minusDays(1);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);


        LocalDate ld3 = LocalDate.of(2001,3,1);
        boolean leapYear = ld3.isLeapYear();
        System.out.println(leapYear);
    }

}
