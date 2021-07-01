package src.check;

public interface ICOVIDCheck {
    double proper_fever = 37.5;
    abstract void waitingPlace(String place);
    abstract boolean feverCheck();
}
