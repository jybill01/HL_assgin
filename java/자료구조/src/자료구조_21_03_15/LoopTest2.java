package src.자료구조_21_03_15;

import java.util.*;

public class LoopTest2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }

        System.out.println("\n\n");

        int m = 1;
        while(m < 10){
            System.out.println(n + "x" + m + "=" + n*m);
            m++;
        }
    }
}
