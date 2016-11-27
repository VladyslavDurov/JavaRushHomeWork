package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<String>(Arrays.asList("мама","мыла","раму"));

        for (int i = 1; i < list.size() + 1; i = i + 2)
        {
            list.add(i, "именно");
        }

        for (String str: list)
        {
            System.out.println(str);
        }

    }
}
