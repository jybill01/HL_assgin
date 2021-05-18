package src.자료구조_21_04_12;

public class Polynomial {
    private int[] coef;
    private int degree;
    public Polynomial(){
        coef = new int[50];
        degree = -1;
    }
    public boolean isZeroP(){
        for(int i = 0; i <= coef.length; i++){
            if(coef[i] <= 0)return true;
        }
        return false;
    }

    public void addTerm(int c, int e) {
        coef[e] = c;
        if (degree < e) ddTerm(e);
    }

    public int maxExp(){
        return degree;
    }

    public int Coef(int e){
        return coef[e];
    }
    public void ddTerm(int e){
        degree = e;
    }
    public void Print(){
        System.out.println("degree = " + maxExp());
        for(int i = degree; i >=0; i--){
            if(coef[i] != 0){
                if(i != degree)System.out.printf(" + ");
                System.out.printf("%dX^%d", Coef(i), i);
            }
        }
    }
}
