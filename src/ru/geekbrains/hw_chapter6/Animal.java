package ru.geekbrains.hw_chapter6;

public abstract class Animal {

    protected String name;
    private static int animalCount;

    protected int stamina;

    public Animal(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
        animalCount++;
    }

    abstract void run(int distance);

    abstract void swim(int distance);

    static int getAnimalCount() {
        return animalCount;
    }
}
