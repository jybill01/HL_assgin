package src.기본API;

import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "] = " + args[i]);

        StringTokenizer st = new StringTokenizer(args[0]);
        int count = st.countTokens();
        System.out.println("모두 " + count + "개의 단어가 있습니다.");

        String[] tmp = new String[count];

        while(st.hasMoreTokens()){
            tmp[--count] = st.nextToken();
        }
        for(int i = 0; i < tmp.length; i++){
            System.out.println("tmp[" + i + "] = " + tmp[i]);
        }
    }
}
