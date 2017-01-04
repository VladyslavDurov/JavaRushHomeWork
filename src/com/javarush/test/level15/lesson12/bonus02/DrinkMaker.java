package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by vlad on 03.01.17.
 */
public abstract class DrinkMaker
{
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }

}
