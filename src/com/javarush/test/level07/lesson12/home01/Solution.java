package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++)
        {
            list.add(0,Integer.valueOf(reader.readLine()));
        }

        for (Integer i:list)
        {
            System.out.println(i);
        }

    }
}
