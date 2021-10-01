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
        
    }

    private static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    private static void checkSumSign() {

        System.out.println("Введите значение для \"a\"");
        a = scanner.nextInt();

        System.out.println("Введите значение для \"b\"");
        b = scanner.nextInt();

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение \"value\"");
        int value = scanner.nextInt();

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {

        System.out.println("Введите значение для \"a\"");
        a = scanner.nextInt();

        System.out.println("Введите значение для \"b\"");
        b = scanner.nextInt();

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
