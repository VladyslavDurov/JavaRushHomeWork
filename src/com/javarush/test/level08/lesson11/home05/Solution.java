package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        StringBuffer sb = new StringBuffer();
        String probel = " ";
        boolean first = false;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.substring(i,1) == " ")
                first = true;

            if (first){
                sb.append(s.substring(i,1).toUpperCase());
                first = false;
            }
            else
                sb.append(s.substring(i,1));


        }
        System.out.print(sb.toString());
    }


}
