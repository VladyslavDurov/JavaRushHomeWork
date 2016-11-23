package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.valueOf(br.readLine());
        int num2 = Integer.valueOf(br.readLine());
        int num3 = Integer.valueOf(br.readLine());
        int number;
        if(num1 == num2)
            number = 3;
        else if(num1 == num3)
            number = 2;
        else
            number = 1;
        System.out.print(number);

    }
}
