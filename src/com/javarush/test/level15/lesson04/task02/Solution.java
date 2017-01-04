package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
        printMatrix(String.valueOf(m), String.valueOf(n), (Object) value);
        printMatrix(String.valueOf(m), String.valueOf(n), value);
        printMatrix(new int[]{m,n}, value);
        printMatrix(value, new int[]{m,n});
        printMatrix((Object) value,new int[]{m,n});
        printMatrix(new String[]{value},new int[]{m,n});
        printMatrix(new Object[]{value},new int[]{m,n});
        printMatrix(new int[]{m,n},new Object[]{value});
        printMatrix(new int[]{m,n},new String[]{value});
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String m, String n, Object value) {
        for (int i = 0; i < Integer.valueOf(m); i++) {
            for (int j = 0; j < Integer.valueOf(n); j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String m, String n, String value) {
        for (int i = 0; i < Integer.valueOf(m); i++) {
            for (int j = 0; j < Integer.valueOf(n); j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[] arr, String value) {
        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String value, int[] arr) {
        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Object value, int[] arr) {
        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String []value, int[] arr) {
        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                System.out.print(value[0]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Object []value, int[] arr) {
        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                System.out.print(value[0]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[] arr, Object []value) {
        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                System.out.print(value[0]);
            }
            System.out.println();
        }
    }




}
