package src.자료구조_21_04_12;

public class PolynomialTest {
    public static void main(String[] args){
        Polynomial p = new Polynomial();
        p.addTerm(7, 5);
        p.addTerm(4, 3);
        p.addTerm(2, 0);
        p.Print();
    }
}
