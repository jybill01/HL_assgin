package src.자료구조_21_03_22;

public class Fraction {
    private int num;
    private int denom;
    public Fraction(int n, int d){
        num = n;
        denom = d;
    }
    public String toString(){
        return (num + "/" + denom);
    }
    public Fraction add(Fraction f){
        Fraction r;
        int d = this.denom * f.denom;
        int n = this.num * f.num;
        r = new Fraction(n, d);
        r.simpify();
        return r;
    }
    private int greatestCD(int x, int y){
        int bigger, smaller, r;
        if(x > y){
            bigger = x;
            smaller = y;
        }
        else{
            bigger = y;
            smaller = x;
        }
        while(smaller != 0){
            r = bigger % smaller;
            bigger = smaller;
            smaller = r;
        }
        return bigger;
    }
    public void simpify(){
        int gcd = greatestCD(num, denom);
        num = num/gcd;
        denom = denom/gcd;
    }

    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(5, 4);
    Fraction f3 = f1.add(f2);
}
