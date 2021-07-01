package src.자료구조_4주차;

import java.util.*;

public class Binary {
    public static void writeBinary(int n){
        if(n != 0) {
            writeBinary(n / 2);
            System.out.println(n % 2);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        writeBinary(n);
    }
}
