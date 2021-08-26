package HomeWorkApp6;

public class Count {
    public static void main(String[] args) {


        System.out.println();
        Cat cat1 = new Cat("Барсик");

        Dog dog1 = new Dog("Шарик");

        System.out.println("Всего животных " + Animal.getCount());
        System.out.println("Всего собак "+Dog.getCount());
        System.out.println("Всего кошек "+ Cat.getCount());

        cat1.run(100);
        cat1.swim(500);
        dog1.run(150);
        dog1.swim(200);
    }
}
