package src.기본API;

public class sum {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        if(args[1].equals("+"))
            System.out.println(a + " + " + b + " = " + (a + b));
        else if(args[1].equals("-"))
            System.out.println(a + " - " + b + " = " + (a - b));
        else
            System.out.println("덧셈과 뺄셈만 가능합니다.");
    }

}
