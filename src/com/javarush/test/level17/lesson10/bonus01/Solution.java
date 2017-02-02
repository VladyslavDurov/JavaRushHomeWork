package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException, IndexOutOfBoundsException{

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]){

            case "-c":{
                Person person;
                String name = args[1];
                Date birthDay = simpleDateFormat.parse(args[3]);

                if(args[2].equals("м"))
                    person = Person.createMale(name, birthDay);
                else
                    person = Person.createFemale(name, birthDay);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }break;
            case "-u":{
                Person person = allPeople.get(Integer.valueOf(args[1]));
                person.setName(args[2]);
                person.setSex(args[3].equals("м")?Sex.MALE:Sex.FEMALE);
                person.setBirthDay(simpleDateFormat.parse(args[4]));
            }break;
            case "-d":{
                allPeople.remove(Integer.valueOf(args[1]));
            }break;
            case "-i":{
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                Person person = allPeople.get(Integer.valueOf(args[1]));
                System.out.println(
                        new StringBuilder().append(person.getName())
                        .append(" ")
                        .append(person.getSex().equals(Sex.MALE)?"м":"ж")
                        .append(" ")
                        .append(sdf.format(person.getBirthDay())));
            }break;
        }

    }
}
