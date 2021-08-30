package ru.com.geekBrains.lesson7;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat[] pets = {
                new Cat("Барсик", 3),
                new Cat("Мурзик", 8),
                new Cat("Пушок", 6),
                new Cat("Том", 2),
                new Cat("Честер", 1),
                new Cat("Снежок", 3),
                new Cat("Васька", 4),
                new Cat("Василиса", 9)
        };
        System.out.println("Укажите первоначальное количество еды в миске:");
        Plate plate = new Plate(new Scanner(System.in).nextInt());

        for (Cat c : pets) {
            while (!c.isFullness() && plate.getFood() >= c.getAppetite()) {
                c.eat(plate);
                plate.info();
            }

        }
        for (Cat c : pets) {
            if (c.isFullness()) {
                System.out.printf("%s наелся\n", c.getName());
            } else {
                System.out.printf("%s остался голодным, ему не хватило %d единиц еды\n", c.getName(), c.getCatFullness() - c.getSaturationFood());
            }
        }
    }
}
