package com.javarush.test.level14.lesson08.bonus01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystem;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (ArithmeticException e)
        {
            exceptions.add(e);
        }

        try
        {
            int [] array = new int[1];
            int a = array[2];

        } catch (IndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }

        try
        {
            String s = "";
            s.substring(2,5);

        } catch (StringIndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }


        try
        {
            throw new NullPointerException("a = null");

        } catch (NullPointerException e)
        {
            exceptions.add(e);
        }

        try
        {
            FileReader fr  = new FileReader("path to file");

        } catch (FileNotFoundException e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new NoSuchFileException("");

        } catch (NoSuchFileException e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new InvalidPathException("","",-1);

        } catch (InvalidPathException e)
        {
            exceptions.add(e);
        }

        try
        {
            Object x[] = new String[3];
            x[0] = new Integer(0);

        } catch (ArrayStoreException e)
        {
            exceptions.add(e);
        }


        try
        {
            throw new UnsupportedOperationException();

        } catch (UnsupportedOperationException e)
        {
            exceptions.add(e);
        }


        try
        {
            throw new RuntimeException();

        } catch (RuntimeException e)
        {
            exceptions.add(e);
        }

    }
}
