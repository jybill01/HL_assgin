package src.IDrawble;

public class ShapeTest {
    public static void main(String[] args){
        IDrawable arrayOfShapes[] = new Shape[4];
        System.out.println("학번 : 20205195, 이름 : 신준용");
        arrayOfShapes[0] = new Shape();
        arrayOfShapes[1] = new Rectangle();
        arrayOfShapes[2] = new Triangle();
        arrayOfShapes[3] = new Circle();
        for(IDrawable obj : arrayOfShapes){
            obj.draw();
        }
    }
}
