package src.기본API;

public class String_1 {
    public static void main(String[] args){
        String a = "java programming";
        String b = a.substring(5);
        String c = a.substring(5,7);
        System.out.println(b);
        System.out.println(c);
        char d = a.charAt(1);
        String e = a + d;
        System.out.println(e);
    }
}
