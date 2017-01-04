package com.javarush.test.level18.lesson03.task01;

import java.io.*;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int max = fis.read();
        while (fis.available() > 0){
            int next = fis.read();
            if (next > max)
                max = next;
        }

        System.out.println(max);

    }
}
