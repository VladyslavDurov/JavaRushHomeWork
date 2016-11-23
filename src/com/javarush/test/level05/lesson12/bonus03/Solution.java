package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n;
        while (true)
        {
            n = Integer.valueOf(reader.readLine());
            if(n > 0)
                break;
        }

        for (int i = 0; i < n; i++) {
                int x = Integer.valueOf(reader.readLine());
                if(i == 0)
                    maximum = x;
                maximum = maximum > x ? maximum : x;
            }
        System.out.println(maximum);

    }
}
