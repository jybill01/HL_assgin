package src.exception;

public class Exception_2 {
    public static void main(String[] args){
        try{
            int x = 0;
            int y = 5 / x;
        } catch (ArithmeticException ae) { System.out.println("Arithmetic Exception"); }
        catch (Exception e) { System.out.println("Exception"); }
        System.out.println("finished");

    }
}
