package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(br.readLine());
        int b = Integer.valueOf(br.readLine());
        int c = Integer.valueOf(br.readLine());
        int [] array = {a, b, c};
        Arrays.sort(array);
        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }

    }

}
