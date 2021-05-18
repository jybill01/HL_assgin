package src.exception;

public class LoginExample {
    public static void main(String[] args) {
        try { login("white", 12345); }
        catch(Exception e) { System.out.println(e.getMessage()); }
        try { login("blue", 54321); }
        catch(Exception e) { System.out.println(e.getMessage()); }
    }
    public static void login(String id, int password) throws NotExistIDException, WrongPasswordException {
        if(id.equals("blue")) throw new NotExistIDException();
        if(password != 12345) throw new WrongPasswordException();
    }
}
