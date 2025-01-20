package com.itheima.a21a22Practices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class practice4 {
    public static void main(String[] args) throws ParseException {
        ///计算你活了多少天
        //JDK7
        String birthday = "2004年11月8日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = sdf.parse(birthday);

        long birthdayTime = parse.getTime();
        long nowTime = System.currentTimeMillis();
        long time = nowTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);


        //JDK8
        LocalDate ld = LocalDate.of(2004,11,8);
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld,now);
        System.out.println(days);



    }
}
