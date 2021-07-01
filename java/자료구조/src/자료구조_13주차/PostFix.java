package src.자료구조_13주차;

import java.io.*;
import java.util.*;

public class PostFix {
    public static int evalPostFix(String exp) {
        Scanner sc = new Scanner(exp);
        Stack s = new Stack();
        while (sc.hasNext()) {
            String n = sc.next();
            if(n.equals("+")){
                int b = (int) s.pop();
                int a = (int) s.pop();
                s.push(a + b);
            }
            else if(n.equals("-")){
                int b = (int) s.pop();
                int a = (int) s.pop();
                s.push(a - b);
            }
            else if(n.equals("*")){
                int b = (int) s.pop();
                int a = (int) s.pop();
                s.push(a * b);
            }
            else if(n.equals("/")){
                int b = (int) s.pop();
                int a = (int) s.pop();
                s.push(a / b);
            }
            else{
                s.push(Integer.parseInt(n));
            }

        }
        return (int) s.pop();
    }
}

