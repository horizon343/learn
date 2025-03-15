package lr2.example8;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Круг");
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
