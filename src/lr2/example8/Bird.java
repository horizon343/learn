package lr2.example8;

public class Bird extends Animal {
    private boolean isFly;

    public Bird(String name, int age, boolean isFly) {
        super(name, age);
        this.isFly = isFly;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " чирикает: чик - чирик");
    }

    public void fly() {
        if (this.isFly) System.out.println(this.name + " летает");
        else System.out.println(this.name + " не умеет летать");
    }
}
