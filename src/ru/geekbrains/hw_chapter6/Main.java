package ru.geekbrains.hw_chapter6;

public class Main {

    public static void main(String[] args) {
        Animal bobik = new Dog("Бобик", 700);
        Animal palkan = new Dog("Палкан", 600);
        Animal alma = new Dog("Альма", 5);
        Animal kiki = new Dog("Кики", 15);
        Animal murzik = new Cat("Мурзик", 200);
        Animal pushok = new Cat("Пушок", 150);
        Animal barsik = new Cat("Барсик", 100);

        bobik.run(100);
        palkan.run(600);
        alma.swim(5);
        kiki.swim(15);

        murzik.run(100);
        pushok.run(300);
        barsik.swim(100);

//        System.out.printf("Собак создано: %d%n", Dog.getDogCount());
        System.out.printf("Котов создано: %d%n", Cat.getCatCount());
        System.out.printf("Всего животных создано: %d%n", Animal.getAnimalCount());
    }
}
