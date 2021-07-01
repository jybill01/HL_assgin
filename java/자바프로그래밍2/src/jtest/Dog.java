package src.jtest;

public class Dog {

    private int age;

    private String color;

    private int food;

    private static int total;



    Dog(){

        total++;

    }

    public String barking() {

        if(this.food <=0 ) {

            return "시무룩";

        } else {

            this.food--;

            return "멍멍";

        }

    }

    public boolean hungry() {

        if(this.food <=1 ) return true;

        else return false;

    }

    public boolean sleeping(int f){
        if(f != 0) {
            this.food += f;
            return false;
        }
        else return true;
    }

    @Override

    public String toString() {

        return "Dog [age=" + age + ", color=" + color + ", food=" + food + "]";

    }

    static int getTotal( ) {

        return total;

    }

}