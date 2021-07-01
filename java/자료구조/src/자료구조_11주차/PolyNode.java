package src.자료구조_11주차;

public class PolyNode {
    int coef;
    int exp;
    PolyNode link;

    public PolyNode(int coef, int exp){
        this.coef = coef;
        this.exp = exp;
        link = null;
    }
}
