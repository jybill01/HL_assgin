package src.exception;

public class WrongPasswordException extends Exception{
    @Override
    public String getMessage() {
        return "잘못된 password입니다.";
    }
}
