package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        Human child1 = new Human();
        child1.name = "child1";
        child1.sex = true;
        child1.age = 10;

        Human child2 = new Human();
        child2.name = "child2";
        child2.sex = true;
        child2.age = 15;

        Human child3 = new Human();
        child3.name = "child3";
        child3.sex = false;
        child3.age = 8;


        Human father = new Human();
        father.name = "father";
        father.sex = true;
        father.age = 45;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);


        Human mother = new Human();
        mother.name = "mother";
        mother.sex = false;
        mother.age = 43;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human grandF1 = new Human();
        grandF1.name = "gf1";
        grandF1.sex = true;
        grandF1.age = 90;
        grandF1.children.add(father);

        Human grandM1 = new Human();
        grandM1.name = "gm1";
        grandM1.sex = false;
        grandM1.age = 88;
        grandM1.children.add(father);

        Human grandF2 = new Human();
        grandF2.name = "gf2";
        grandF2.sex = true;
        grandF2.age = 89;
        grandF2.children.add(mother);

        Human grandM2 = new Human();
        grandM2.name = "gm2";
        grandM2.sex = false;
        grandM2.age = 86;
        grandM2.children.add(mother);

        System.out.println(grandF2);
        System.out.println(grandM2);
        System.out.println(grandF1);
        System.out.println(grandM1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
