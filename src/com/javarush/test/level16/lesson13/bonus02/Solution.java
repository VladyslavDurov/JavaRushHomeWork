package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {

        threads.add(new Thread_A());
        threads.add(new Thread_B());
        threads.add(new Thread_C());
        threads.add(new Thread_D());
        threads.add(new Thread_E());

    }

    public static void main(String[] args) throws InterruptedException
    {

        Thread thread_A = threads.get(0);
        thread_A.start();

        Thread thread_B = threads.get(1);
        thread_B.start();
        thread_B.interrupt();

        Thread thread_C = threads.get(2);
        thread_C.start();
        Thread.sleep(2000);
        thread_C.interrupt();

        Thread_D thread_D = (Thread_D) threads.get(3);
        thread_D.start();
        thread_D.showWarning();
        System.out.println(thread_D.isAlive());

        Thread thread_E = threads.get(4);
        thread_E.start();

    }


    public static class Thread_A extends Thread{
        @Override
        public void run()
        {
            while (true){}
        }
    }

    public static class Thread_B extends Thread{
        @Override
        public void run()
        {
            try
            {
                while (!Thread.currentThread().isInterrupted()){}
                throw new InterruptedException("InterruptedException");
            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static class Thread_C extends Thread{
        @Override
        public void run()
        {
            try
            {
                while (true){
                    Thread.sleep(500);
                    System.out.println("Ура");
                }

            }catch (InterruptedException ex){
                if(!isInterrupted())
                    interrupt();
            }
        }
    }

    public static class Thread_D extends Thread implements Message{
        @Override
        public void run()
        {
            while (!isInterrupted()){}
        }

        @Override
        public void showWarning()
        {
            interrupt();
            try
            {
                join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static class Thread_E extends Thread{
        @Override
        public void run()
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int sum = 0;
            String str;
            try{
                while (!isInterrupted()){

                    str = br.readLine();
                    if (str.equals("N"))
                    {
                        interrupt();
                        continue;
                    }
                    sum+=Integer.parseInt(str);
                }
                throw new InterruptedException();
            }
            catch (IOException e)
            {

            }
            catch (InterruptedException e){
                System.out.println(sum);
            }
        }
    }



}
