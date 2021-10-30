package ru.geekbrains.hw_chapter7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public Cat() {
        this(null, 0);
    }

    void eat(Plate p) {
        while (p.getFood() < appetite) {
            System.out.println("В тарелке не достаточно еды...");
            p.increaseFood(this);
        }
        p.decreaseFood(appetite);
        satiety = true;
    }

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    int getAppetite() {
        return appetite;
    }

    private void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    boolean isSatiety() {
        return satiety;
    }

    protected void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
