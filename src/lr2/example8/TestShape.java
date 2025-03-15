package lr2.example8;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Круг\tПлощадь: " + circle.calcArea() + "\tПериметр: " + circle.calcPerimeter());
        System.out.println("Квадрат\tПлощадь: " + square.calcArea() + "\tПериметр: " + square.calcPerimeter());
        System.out.println("Треугольник\tПлощадь: " + triangle.calcArea() + "\tПериметр: " + triangle.calcPerimeter());
    }
}
