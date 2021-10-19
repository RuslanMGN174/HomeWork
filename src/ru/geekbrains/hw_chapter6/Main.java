package ru.geekbrains.hw_chapter6;

public class Main {

    public static void main(String[] args) {
        Animal bobik = new Dog("Бобик");
        Animal palkan = new Dog("Палкан");
        Animal alma = new Dog("Альма");
        Animal kiki = new Dog("Кики");
        Animal murzik = new Cat("Мурзик");
        Animal pushok = new Cat("Пушок");
        Animal barsik = new Cat("Барсик");

        bobik.run(100);
        palkan.run(600);
        alma.swim(5);
        kiki.swim(15);

        murzik.run(100);
        pushok.run(300);
        barsik.swim(100);

        System.out.printf("Собак создано: %d%n", Dog.getDogCount());
        System.out.printf("Котов создано: %d%n", Cat.getCatCount());
        System.out.printf("Всего животных создано: %d%n", Animal.getAnimalCount());
    }
}
