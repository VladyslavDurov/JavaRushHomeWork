package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{


    public static void main(String[] args) throws ParseException
    {
        boolean b = isDateOdd("JANUARY 1 2020");
        System.out.println(b);
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Date inputdate = sdf.parse(date);
        Calendar calendarIn = sdf.getCalendar();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputdate);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.MONTH, 0);
        long x = (calendarIn.getTimeInMillis() - calendar.getTimeInMillis())/1000/60/60/24;
        System.out.println(x);
        return x % 2 == 0 ? false : true;
    }
}
