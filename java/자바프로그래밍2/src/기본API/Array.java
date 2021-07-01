package src.기본API;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "] = " + args[i]);
        }

        String[] tmp = Arrays.copyOf(args, args.length);
        System.out.println("\n== Before Sort (array temp) ==");
        for(int i = 0; i < tmp.length; i++){
            System.out.println(tmp[i]);
        }

        Arrays.sort(tmp);
        System.out.println("\n== After Sort (array tmp) ==");
        for(int i = 0; i < tmp.length; i++){
            System.out.println(tmp[i]);
        }
    }
}
