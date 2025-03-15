package lr2;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double calcArea(){
        return this.height * this.width;
    }
    public double calcPerimeter(){
        return (this.height + this.width) * 2;
    }
}
