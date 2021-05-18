package src.check;

public class Student {
    protected String schooltype;
    protected String name;
    protected double fever;

    Student(){
        this("University", "Anonymous", 36.5);
    }
    Student(String schooltype, String name, double fever){
        this.schooltype = schooltype;
        this.name = name;
        this.fever = fever;
    }
}
