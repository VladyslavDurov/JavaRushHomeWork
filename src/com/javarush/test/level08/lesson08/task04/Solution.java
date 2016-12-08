package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("MARCH 1 1980"));
        map.put("Stallone2", new Date("DECEMBER 1 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("APRIL 1 1980"));
        map.put("Stallone5", new Date("AUGUST 1 1980"));
        map.put("Stallone6", new Date("OCTOBER 1 1980"));
        map.put("Stallone7", new Date("NOVEMBER 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("AUGUST 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Date> item = (Map.Entry) it.next();
            int numberOfMonth = item.getValue().getMonth();
            if(numberOfMonth == 5 || numberOfMonth == 6 || numberOfMonth == 7)
                it.remove();
        }

    }


    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry entry: map.entrySet())
        {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
