package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        List<Integer> bytes = new ArrayList<>();

        while (fis.available() > 0){
            Integer b = (Integer)fis.read();
            if(!bytes.contains(b))
                bytes.add(b);
        }

        Collections.sort(bytes);
        for (Integer b: bytes)
        {
            System.out.print(b+" ");
        }

    }
}
