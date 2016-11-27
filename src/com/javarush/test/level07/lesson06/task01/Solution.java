package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            list.add(String.valueOf (new Random().nextInt(10000)));
        }
        System.out.println(list.size());
        for (String str: list)
        {
            System.out.println(str);
        }
    }
}
