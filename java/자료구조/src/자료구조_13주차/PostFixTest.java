package src.자료구조_13주차;

import java.util.*;

public class PostFixTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String exp = input.nextLine();
        System.out.println(PostFix.evalPostFix(exp));
    }
}
