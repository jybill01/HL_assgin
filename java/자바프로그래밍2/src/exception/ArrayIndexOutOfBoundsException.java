package src.exception;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] array = new int[2];
        try{
            array[2] = 2;
        } catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스를 확인해서 사용하세요.");
        }
    }
}
