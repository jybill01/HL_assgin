package src.exception;

public class NotExistIDException extends Exception{
    @Override
    public String getMessage() {
        return "존재하지 않는 id입니다.";
    }
}
