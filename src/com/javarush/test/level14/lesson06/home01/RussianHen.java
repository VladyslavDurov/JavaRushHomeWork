package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vlad on 22.12.16.
 */
public class RussianHen extends Hen
{
    @Override
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 40;
    }

}
