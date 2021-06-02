package src.자료구조_13주차;

import java.io.*;
import java.util.*;

public class Paren {
    public static boolean check(String exp) {
        Stack stack = new Stack();
        for(int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);
            if(c == '(' || c == '[' || c == '{')stack.push(c);
            else if(c == ')'){
                char left = (char) stack.pop();
                if(left != '(')return false;
            }
            else if(c == ']'){
                char left = (char) stack.pop();
                if(left != '[')return false;
            }
            else if(c == '}'){
                char left = (char) stack.pop();
                if(left != '{')return false;
            }
        }
        if(stack.top != null)return false;
        else return true;
    }
}
