package src.기본API;

import java.util.*;

public class Password {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("학번 : 20205195 \n이름 : 신준용");
        String s;
        String id = "abcdef";
        System.out.print("아이디를 입력하세요 : ");
        s = scan.next();
        if(id.equals(s))
            System.out.println("id가 일지합니다.");
        else
            System.out.println("id가 일치하지 않습니다.");
    }
}
