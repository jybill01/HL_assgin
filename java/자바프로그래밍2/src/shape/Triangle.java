package src.shape;

public class Triangle extends Shape{
    private double x;
    private double y;
    public Triangle(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public double getArea() {
        return x * y * 0.5;
    }
}
