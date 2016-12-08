package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int height;
    int age;


    public void initialize(String name){
        this.name = name;
   }

    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

}