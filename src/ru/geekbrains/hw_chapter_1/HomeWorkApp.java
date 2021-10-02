package ru.geekbrains.hw_chapter_1;

import java.util.Scanner;

public class HomeWorkApp {

    private static Scanner scanner = new Scanner(System.in);
    private static int a;
    private static int b;

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        scanner.close();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {

        System.out.println("Введите число \"a\"");
        a = inputNumber();

        System.out.println("Введите число \"b\"");
        b = inputNumber();

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {

        System.out.println("Введите числовое значение \"value\"");
        int value = inputNumber();

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        System.out.println("Введите число \"a\"");
        a = inputNumber();

        System.out.println("Введите число \"b\"");
        b = inputNumber();

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static int inputNumber() {
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
