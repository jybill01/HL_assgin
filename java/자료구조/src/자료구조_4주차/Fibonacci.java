package src.자료구조_4주차;

import java.util.Scanner;

public class Fibonacci {
    public static int longFib(int i){
        if(i <= 1)return i;
        return longFib(i - 1) + longFib(i - 2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(longFib(i));
        }
    }
}
