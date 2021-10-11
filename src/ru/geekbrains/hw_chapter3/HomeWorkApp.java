package ru.geekbrains.hw_chapter3;

import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {
//        arrayOfInt();
//        arrayOf100Int();
//        lessThan6Array();
//        twoDimensionalArray();
//        System.out.println(Arrays.toString(someArray(8, 4)));
//        minAndMax(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
//        shiftElementsOfArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1},-1);
//        System.out.println(isTwoHalvesEqual(new int[]{1, 5, 3, 2, 4, 1, 1}));
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void arrayOfInt() {
        int[] array = Arrays.stream(new int[]{0, 1, 0, 1, 0, 1, 0})
                .map(a -> a == 0 ? 1 : 0)
                .toArray();
        System.out.println(Arrays.toString(array));
    }

    //2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    private static void arrayOf100Int() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void lessThan6Array() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        array = Arrays.stream(array).map(a -> a < 6 ? a * 2 : a).toArray();
        System.out.println(Arrays.toString(array));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void twoDimensionalArray() {
        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + j) % 2 == 0 ?  1 : 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и
    // возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    private static int[] someArray(int len, int initialValue) {
        return Arrays.stream(new int[len]).map(a -> initialValue).toArray();
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    private static void minAndMax(int[] array) {
        System.out.printf("max = %d, min = %d",
                Arrays.stream(array).max().orElseThrow(),
                Arrays.stream(array).min().orElseThrow());
    }

    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место,
    // в котором сумма левой и правой части массива равны.
    private static boolean isTwoHalvesEqual(int[] array) {
        int sumLeft = array[0];
        int sumRight = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sumRight += array[j];
            }
            if (sumLeft == sumRight) {
                return true;
            }
            sumLeft += array[i];
            sumRight = 0;
        }
        return false;
    }

    //8. *** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен
    // сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    private static void shiftElementsOfArray(int[] array, int count) {
        int cyclesCount = 0;
        while (cyclesCount != Math.abs(count)) {
            if (count > 0) {
                moveRightArray(array);
            } else {
                moveLeftArray(array);
            }
            cyclesCount++;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void moveRightArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }

    private static void moveLeftArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
        }
    }
}

