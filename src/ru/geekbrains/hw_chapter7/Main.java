package ru.geekbrains.hw_chapter7;

public class Main {

    private static Cat[] catsArray;
    private static Plate plate;

    public static void main(String[] args) {

        catsArray = new Cat[3];
        catsArray[0] = new Cat("Barsik", 5);
        catsArray[1] = new Cat("Fluffy", 15);
        catsArray[2] = new Cat("Kiki", 51);
        plate = new Plate(6);

        for (Cat cat : catsArray) {
            cat.eat(plate);
            System.out.printf("Сытость кота %s: %s%n", cat.getName(), cat.isSatiety());
        }
    }
}
