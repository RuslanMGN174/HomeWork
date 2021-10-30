package ru.geekbrains.hw_chapter7;

import java.util.Scanner;

public class Plate {

    private int food;
    private Scanner scanner = new Scanner(System.in);

    public Plate(int food) {
        this.food = food;
    }

    public Plate() {
        this(0);
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void increaseFood(Cat cat) {
        if (cat.getAppetite() > food) {
            System.out.printf("Кот %s голодает.%n" + "Добавьте еду в тарелку (минимальное количество %d)%n", cat.getName(), (cat.getAppetite() - food));
            setFood(Integer.parseInt(scanner.next()) + food);
        }
    }

    void info() {
        System.out.println("Food amount: " + food);
    }

    int getFood() {
        return food;
    }

    private void setFood(int food) {
        this.food = food;
    }
}