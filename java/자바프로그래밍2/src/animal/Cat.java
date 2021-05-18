package src.animal;

public class Cat extends Animal {
    public String name;
    public static int count;

    Cat(){
        this.name = "Anonymous고양이";
        this.count += 1;
    }
    Cat(String name){
        this.name = name+"고양이";
        this.count += 1;
    }
    public String name(){
        return this.name;
    }
    public String reaction(){
        return "꼬리내리고";
    }
    public String sound(){
        return "야~옹";
    }
}
