package src.기본API;

class Rectangle {
    int width, height;
    int area() { return width*height; }
}

class Box <Boolean>{
    
}

public class Test {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 10;
        myRect.height = 20;
        System.out.println("면적은 " + myRect.area());
    }
}
