package com.javarush.test.level04.lesson10.task02;

import java.io.*;

/* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int counter = 10;
        while (counter > 0){
            System.out.println(counter);
            counter-=1;
        }

    }
}
