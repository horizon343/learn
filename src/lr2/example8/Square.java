package lr2.example8;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Квадрат");
        this.side = side;
    }

    @Override
    public double calcArea() {
        return this.side * this.side;
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }
}
