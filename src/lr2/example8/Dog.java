package lr2.example8;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " лает: гав - гав");
    }

    public void fetch() {
        System.out.println(this.name + " приносит палку");
    }
}
