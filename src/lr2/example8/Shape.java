package lr2.example8;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();
}
