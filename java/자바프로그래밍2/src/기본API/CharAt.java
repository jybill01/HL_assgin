package src.기본API;

public class CharAt {
    public static void main(String[] args){
        int count = 0;
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[0].length(); j++){
                if(args[0].charAt(j) >= '0' && args[0].charAt(j) <= '9')
                    count++;
            }
        }
        System.out.println("숫자 = " + count);
    }
}
