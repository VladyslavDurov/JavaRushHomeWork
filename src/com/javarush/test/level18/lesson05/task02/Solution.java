package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        InputStreamReader isr = new InputStreamReader(System.in);
        FileInputStream fio = new FileInputStream(new BufferedReader(isr).readLine());

        int counter = 0;
        while(fio.available() > 0){
            if(fio.read() == 44)
                counter++;
        }

        System.out.println(counter);

        isr.close();
        fio.close();

    }
}
