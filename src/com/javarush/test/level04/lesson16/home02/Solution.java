package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++)
        {
           list.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(list);
        System.out.print(list.get(1));
    }
}
