package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayBig = new int[20];
        int[] arraySmall1;
        int[] arraySmall2;

        for (int i = 0; i < arrayBig.length; i++)
        {
            arrayBig[i] = Integer.valueOf(br.readLine());
        }

        arraySmall1 = Arrays.copyOfRange(arrayBig, 0, arrayBig.length/2-1);
        arraySmall2 = Arrays.copyOfRange(arrayBig, arrayBig.length/2, arrayBig.length);

        for (int i = 0; i < arraySmall2.length; i++)
        {
            System.out.println(arraySmall2[i]);
        }

    }
}
