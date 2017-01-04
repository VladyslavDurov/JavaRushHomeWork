package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution()
    {
    }
    public Solution(Integer a, String b)
    {
    }

    public Solution(String a, Integer b)
    {
    }
    protected Solution(String s)
    {
    }
    protected Solution(Double s)
    {
    }
    protected Solution(int s)
    {
    }
    Solution(String a, String b)
    {
    }
    Solution(Integer a, Integer b)
    {
    }
    Solution(Double a, Double b)
    {
    }
    private Solution(Double a, String b){

    }
    private Solution(char a){

    }
    private Solution(Integer a){

    }
}

