package lr2.example8;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        super("Треугольник");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calcArea() {
        double res = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(res * (res - this.side1) * (res - this.side2) * (res - this.side3));
    }

    @Override
    public double calcPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}
