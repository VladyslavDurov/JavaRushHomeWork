package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++)
        {
            map.put("LastName"+i, (i % 3 == 0 ? "FirstName" : "FirstName"+i));
            System.out.println((i % 3 == 0 ? "FirstName" : "FirstName"+i));
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy1 = new HashMap<>(map);
        HashMap<String, String> copy2 = new HashMap<>(map);

        for (Map.Entry<String, String> pair1: copy1.entrySet())
        {
            int count = 0;

            for (Map.Entry<String, String> pair2: copy2.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue())) {
                    count++;
                }
            }

           if (count > 1) {
                removeItemFromMapByValue(map, pair1.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
    }
}
