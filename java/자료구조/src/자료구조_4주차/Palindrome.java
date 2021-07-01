package src.자료구조_4주차;

import java.util.Scanner;

public class Palindrome {
    public static Boolean determinPalindrome(String s){
        Boolean a = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))a = false;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String n = input.next();
        if(determinPalindrome(n))System.out.println("같다");
        else System.out.println("다르다");
    }
}
