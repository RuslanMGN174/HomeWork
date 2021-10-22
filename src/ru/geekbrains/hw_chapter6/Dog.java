package ru.geekbrains.hw_chapter6;

public class Dog extends Animal {

    private static int dogCount;

    public Dog(String name, int stamina) {
        super(name, stamina);
        dogCount++;
    }

    @Override
    void run(int distance) {
        System.out.printf(distance > stamina
                ? "Дальность бега собаки не больше %2$dм%n"
                : "%s пробежал %dм%n", name, stamina);
    }

    @Override
    void swim(int distance) {
        System.out.printf(distance > stamina
                ? "Дальность заплыва собаки не больше %2$dм%n"
                : "%s проплыл %dм%n", name, stamina);
    }

    static int getDogCount() {
        return dogCount;
    }
}
