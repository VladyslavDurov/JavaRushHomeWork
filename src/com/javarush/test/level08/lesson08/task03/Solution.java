package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++)
        {
            hashMap.put("LastName" + i, "FirstName" + i);
        }

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int counter = 0;
        for (String firsname: map.values())
        {
            if(firsname.equals(name))
                counter++;
        }
        return counter;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {

        int counter = 0;
        for (String name: map.keySet())
        {
            if(name.equals(lastName))
                counter++;
        }
        return counter;
    }


    public static void main(String[] args)
    {
        System.out.println(getCountTheSameFirstName(createMap(),"FirstName2"));
        System.out.println(getCountTheSameLastName(createMap(),"LastName2"));
    }

}
