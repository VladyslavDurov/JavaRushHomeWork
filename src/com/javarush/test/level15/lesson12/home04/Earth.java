package com.javarush.test.level15.lesson12.home04;

/**
 * Created by vlad on 01.01.17.
 */
public class Earth implements Planet
{
    private static Earth earth;

    private Earth() {}

    public static Earth getInstance(){
        if (earth==null)
            earth = new Earth();
        return earth;
    }
}
