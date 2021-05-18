package src.기본API;

import java.util.Scanner;

public class ReverseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        System.out.print("문자열을 입력하시오: ");
        String s = scan.next();
        buffer.append(s);
        System.out.println(buffer.reverse());
    }
}
