package ru.geekbrains.hw_chapter6;

public class Cat extends Animal{

    private static int catCount;

    public Cat(String name, int stamina) {
        super(name, stamina);
        catCount++;
    }

    @Override
    void run(int distance) {
        System.out.printf(distance > stamina
                ? "Дальность бега кота не больше %2$dм%n"
                : "%s пробежал %dм%n", name, stamina);
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плавать!\n");
    }

    static int getCatCount() {
        return catCount;
    }
}
