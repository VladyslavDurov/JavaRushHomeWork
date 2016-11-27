package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<String>();
        List<String> listMaxString = new ArrayList<String>();
        list.add(br.readLine());
        listMaxString.add(list.get(0));
        for (int i = 0; i < 4; i++)
        {
            String str = br.readLine();
            if(str.length() > listMaxString.get(0).length())
            {
                listMaxString.clear();
                listMaxString.add(str);
            }
            else if(str.length() == listMaxString.get(0).length())
                listMaxString.add(str);

            list.add(str);

        }

        for (String s: listMaxString)
        {
            System.out.println(s);
        }


    }
}
