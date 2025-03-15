package lr2.example8;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " мяукает: мяу - мяу");
    }

    // Дополнительный метод
    public void scratch() {
        System.out.println(this.name + " царапает мебель");
    }
}
