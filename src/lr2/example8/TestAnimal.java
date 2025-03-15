package lr2.example8;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Рэкс", 3, "овчарка");
        Cat cat = new Cat("Мурзик", 2, "рыжий");
        Bird bird = new Bird("Кеша", 5, true);

        System.out.println("========== Информация о собаке ==========");
        dog.makeSound();
        dog.fetch();

        System.out.println("\n========== Информация о кошке ==========");
        cat.makeSound();
        cat.scratch();

        System.out.println("\n========== Информация о птице ==========");
        bird.makeSound();
        bird.fly();
    }
}
