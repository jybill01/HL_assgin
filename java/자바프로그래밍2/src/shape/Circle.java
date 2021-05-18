package src.shape;

public class Circle extends Shape{
    private double x;
    private double y;

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return x * x * y;
    }
}
