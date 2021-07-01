package src.자료구조_21_03_15;

import java.util.*;

public class ArrayTest3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] a = new int[101];
        int size = 0;
        int b = 0, tmp = 0;

        while(b > -1){
            b = input.nextInt();
            a[size] = b;
            size++;
        }

        System.out.println("\n\n");

        for(int i = 0; i < size - 1; i++){
            System.out.println(a[i]);
        }

        System.out.println("\n\n");

        for(int i = 0; i < size - 1; i++){
            for(int j = i; j < size - 1; j++){
                if(a[i] < a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        for(int i = 0; i < size - 1; i++){
            System.out.println(a[i]);
        }
    }
}
