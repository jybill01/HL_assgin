package src.animal;

public class Dog extends Animal {
    public String name;
    public static int count;
    Dog(){
        this.name = "Anonymous강아지";
        this.count += 1;
    }
    Dog(String name){
        this.name = name+"강아지";
        this.count += 1;
    }
    public String name(){
        return this.name;
    }
    public String reaction(){
        return "꼬리올리고";
    }
    public String sound(){
        return "멍멍";
    }
}