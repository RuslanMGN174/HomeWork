package ru.geekbrains.hw_chapter6;

public abstract class Animal {

    protected String name;
    protected int distance;
    private int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    private void run(int distance) {

    }

    private void swim(int distance) {

    }

}
