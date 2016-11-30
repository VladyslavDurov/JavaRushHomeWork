package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.time.Month;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException, ParseException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        //System.out.println(str + " is " + Month.valueOf(str.toUpperCase()).getValue() + " month");
        SimpleDateFormat smf = new SimpleDateFormat("MMMM");
        Date docDate = smf.parse(str);
        System.out.println(str + " is " + (docDate.getMonth()+1) + " month");
    }

}
