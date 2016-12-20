package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        File file = new File(br.readLine());

        BufferedReader fin = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<Integer> list = new ArrayList<>();
        while ((line = fin.readLine()) != null)
        {
            int a = Integer.valueOf(line);
            if (a % 2 == 0)
                list.add(a);
        }
        Collections.sort(list);
        for (Integer x: list)
        {
            System.out.println(x);
        }

    }
}
