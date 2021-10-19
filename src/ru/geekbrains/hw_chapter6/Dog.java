package ru.geekbrains.hw_chapter6;

public class Dog extends Animal {

    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    void run(int distance) {
        System.out.printf(distance > 500
                ? "Дальность бега собаки не больше 500м%n"
                : "%s пробежал %dм%n", name, distance);
    }

    @Override
    void swim(int distance) {
        System.out.printf(distance > 10
                ? "Дальность заплыва собаки не больше 10м%n"
                : "%s проплыл %dм%n", name, distance);
    }

    static int getDogCount() {
        return dogCount;
    }
}
