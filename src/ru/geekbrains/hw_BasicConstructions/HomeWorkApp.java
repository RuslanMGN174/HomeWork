package ru.geekbrains.hw_BasicConstructions;

import java.io.IOException;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) throws IOException {
//        System.out.println(isAmountInRange(2, 3));
//        System.out.println(positiveOrNegative2(1));
//        System.out.println(checkLeapYear(2021));
//        positiveOrNegative(1);
//        printStrings("Люблю тебя, Петра творенье!", 3);
    }

    private static boolean isAmountInRange(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    private static void positiveOrNegative(int a) {
        String answer = (a < 0) ? "Отрицательное" : "Положительное";
        System.out.println(answer);
    }

    private static boolean positiveOrNegative2(int a) {
        return (a < 0);
    }

    private static void printStrings(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    private static boolean checkLeapYear(int a) {
        return (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
    }
}
