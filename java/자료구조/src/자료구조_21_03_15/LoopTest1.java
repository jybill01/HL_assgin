package src.자료구조_21_03_15;

public class LoopTest1 {
    public static void main(String[] args){
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println("\n");
        }

        System.out.println("\n\n\n");

        int n = 2;
        while(n <= 9){
            int m = 1;
            while(m <= 9){
                System.out.println(n + "x" + m + "=" + n*m);
                m++;
            }
            n++;
            System.out.println("\n");
        }
    }
}
