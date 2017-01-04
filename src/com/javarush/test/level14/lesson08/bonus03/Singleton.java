package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by vlad on 25.12.16.
 */
public class Singleton
{

    private static Singleton singleton = new Singleton();

    static Singleton getInstance(){
        return singleton;
    }

    private Singleton() {}
}
