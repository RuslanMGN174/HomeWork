package ru.geekbrains.hw_chapter6;

public abstract class Animal {

    protected String name;
    private static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    abstract void run(int distance);

    abstract void swim(int distance);

    static int getAnimalCount() {
        return animalCount;
    }
}
