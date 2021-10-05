package ru.geekbrains.hw_BasicConstructions;

import java.io.IOException;
import java.util.Scanner;

public class HomeWorkApp {

    private static Scanner scanner = new Scanner(System.in);
    private static int a;

    public static void main(String[] args) throws IOException {

    }

    private static boolean isAmountInRange(int a, int b){
        return (a + b) >=10 && (a + b) <= 20;
    }

    private static void positiveOrNegative(int a) {
       String answer = (a < 0) ? "Отрицательное" : "Положительное";
        System.out.println(answer);
    }

    private static void printStrings(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    private static boolean checkLeapYear() {
        System.out.println("Введите год");
        a = getNumber();
        return (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
    }

    private static int getNumber() {
        System.out.println("ожидаю ввод целого числа...");
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число");
            scanner.next();
        }
        return scanner.nextInt();
    }


}
