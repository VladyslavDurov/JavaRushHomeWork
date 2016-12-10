package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String firstName;
        private String lastName;
        private int age;
        private boolean sex;
        private String phoneNumber;
        private String email;

        public Human(){}
        public Human(String firstName){
            this.firstName = firstName;
        }
        public Human(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Human(String firstName, String lastName, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public Human(String firstName, String lastName, int age, boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }
        public Human(String firstName, String lastName, int age, boolean sex, String phoneNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.phoneNumber = phoneNumber;
        }
        public Human(String firstName, String lastName, int age, boolean sex, String phoneNumber, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
        public Human(String firstName, String lastName, boolean sex, String phoneNumber, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
        public Human(String firstName, String lastName, boolean sex, String phoneNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.phoneNumber = phoneNumber;
        }
        public Human(String firstName, String lastName, String phoneNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }


    }
}
