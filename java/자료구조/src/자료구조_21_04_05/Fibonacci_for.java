package src.자료구조_21_04_05;

public class Fibonacci_for {
    public static int fib_i(int n){
        if(n <= 1)return n;
        int fn2 = 0, fn1 = 1, fn = 0;
        for(int i = 2; i <= n; i++){
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }
        return fn;
    }

    public static void main(String[] args){
        System.out.println(fib_i(10));
    }
}
