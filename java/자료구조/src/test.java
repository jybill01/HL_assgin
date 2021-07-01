package src;

public class test {
    int coef[];
    int degree;
    public test() {
        coef = new int[10000];
        degree = -1;
    }

    public test tatst(int a, int c){
        test test = new test();
        test.coef[1] = a;
        test.degree = c;
        return test;
    }
}
