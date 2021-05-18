package src.isound;

public class SoundExample {
    public static void printSound(ISound iSound){
        System.out.println(iSound.sound());
    }
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        printSound(cat);
        printSound(dog);
    }
}
