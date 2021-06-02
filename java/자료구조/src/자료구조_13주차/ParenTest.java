package src.자료구조_13주차;

import java.io.*;
import java.util.*;

public class ParenTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String exp = input.nextLine();
        System.out.print(Paren.check(exp));
    }
}
