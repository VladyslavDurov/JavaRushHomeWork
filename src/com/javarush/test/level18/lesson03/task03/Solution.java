package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        FileInputStream fis = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> counts = new ArrayList<>();

        int maxCount = 0;
        while (fis.available() > 0){
            Integer key = (Integer)fis.read();
            if(map.containsKey(key)){
                int count = map.get(key)+1;
                map.put(key, count);
                if (count > maxCount)
                    maxCount = count;
            }
            else
                map.put(key, 1);
        }

        for (Map.Entry pair: map.entrySet())
        {
            if(pair.getValue().equals(maxCount) && !counts.contains(pair.getKey()))
                counts.add((Integer) pair.getKey());
        }


        for (Integer c: counts)
        {
            System.out.print(c+" ");
        }
    }
}
