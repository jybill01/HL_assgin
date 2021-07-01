package src.exception;

public class Exception_1 {
    public static void main(String[] args) {
        try{
            sub();
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스를 확인하고 사용하세요.");
        }
    }
    public static void sub() throws java.lang.ArrayIndexOutOfBoundsException {
        int[] array = new int[10];
        int i = array[10];
    }
}
