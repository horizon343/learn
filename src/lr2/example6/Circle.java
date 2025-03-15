package lr2.example6;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
