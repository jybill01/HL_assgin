package src.shape;


public class ShapeTest {
    public static void main(String[] args){
        Shape [] shapes = new Shape[4];
        shapes[0] = new Triangle(5.0, 3.0);
        shapes[1] = new Circle(8.0, 3.14);
        shapes[2] = new Triangle(7.0, 4.0);
        shapes[3] = new Circle(10.0, 3.14);

        for(Shape obj : shapes){
            System.out.println(obj.getArea());
        }
    }
}
