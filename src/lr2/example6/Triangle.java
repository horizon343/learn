package lr2.example6;

public class Triangle implements Shape {
    private double size1;
    private double size2;
    private double size3;

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    @Override
    public double calcArea() {
        double res = (this.size1 + this.size2 + this.size3) / 2;
        return Math.sqrt(res * (res - this.size1) * (res - this.size2) * (res - this.size3));
    }

    @Override
    public double calcPerimeter() {
        return this.size1 + this.size2 + this.size3;
    }
}
