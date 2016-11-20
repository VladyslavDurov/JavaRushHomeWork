package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(br.readLine());
        int b = Integer.valueOf(br.readLine());
        int c = Integer.valueOf(br.readLine());
        if(a == b && b == c)
            System.out.print(a + " " + b + " " + c);
        else
            if(a == b)
                System.out.print(a + " " + b);
            else if(b == c)
                System.out.print(b + " " + c);
            else if(a == c)
                System.out.print(a + " " + c);

    }
}