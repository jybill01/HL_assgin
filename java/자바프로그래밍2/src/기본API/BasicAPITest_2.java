package src.기본API;

import java.util.regex.Pattern;

public class BasicAPITest_2 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i] + " ");
            if(Pattern.matches("^[0-9]*$", args[i]) == true){
                sum += Integer.parseInt(args[i]);
            }
        }
        System.out.println(sum);
    }
}
