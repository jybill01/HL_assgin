package src.자료구조_21_03_15;

public class ArrayTest2 {
    public static void increment(int y, int [] b){
        y++;
        b[0]++;
    }

    public static void main(String[] args){
        int x = 1;
        int [] a = { 10, 20, 30 };
        increment(x, a);
        System.out.println("x = " + x +  " a[0] = " + a[0]);
    }
}
