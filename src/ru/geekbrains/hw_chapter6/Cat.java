package ru.geekbrains.hw_chapter6;

public class Cat extends Animal{

    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    void run(int distance) {
        System.out.printf(distance > 200
                ? "Дальность бега кота не больше 200м%n"
                : "%s пробежал %dм%n", name, distance);
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плавать!\n");
    }

    static int getCatCount() {
        return catCount;
    }
}
