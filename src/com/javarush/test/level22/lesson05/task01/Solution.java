package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

            if (string == null || string.isEmpty() || string.split(" ").length < 6) {
                throw new TooShortStringException();
            }

            int startIndex, stopIndex = string.indexOf(" ");
            startIndex = stopIndex + 1;
            for (int i = 0; i < 4; i++)
            {
                stopIndex = string.indexOf(" ", stopIndex + 1);
            }

            return string.substring(startIndex, stopIndex);

    }

    public static class TooShortStringException extends Exception {
    }

}
