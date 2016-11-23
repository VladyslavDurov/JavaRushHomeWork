package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfather = reader.readLine();
        Cat catgrandfather = new Cat(grandfather);

        String grandmother = reader.readLine();
        Cat catgrandmother = new Cat(grandmother);

        String father = reader.readLine();
        Cat catfather = new Cat(father, catgrandfather, null);

        String mother = reader.readLine();
        Cat catmother = new Cat(mother, null, catgrandmother);

        String son = reader.readLine();
        Cat catson = new Cat(son, catfather, catmother);

        String daughter = reader.readLine();
        Cat catdaughter = new Cat(daughter, catfather, catmother);

        System.out.println(catgrandfather);
        System.out.println(catgrandmother);
        System.out.println(catfather);
        System.out.println(catmother);
        System.out.println(catson);
        System.out.println(catdaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parent2)
        {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString()
        {
            String p1 = parent2 == null ? ", no mother" : ", mother is " + parent2.name;
            String p2 = parent == null ? ", no father" : ", father is " + parent.name;
            return "Cat name is " + name + p1 + p2;

        }
    }

}
