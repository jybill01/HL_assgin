package src.자료구조_21_03_22;

public class Inte {
    int i;
    public Inte(int a){
        i = a;
    }
    public void swap(Inte x, Inte y){
        int temp = x.i;
        x.i = y.i;
        y.i = temp;
    }

    int a = 10;
    int b = 20;
    Inte aa = new Inte(a);
    Inte bb = new Inte(b);
}
