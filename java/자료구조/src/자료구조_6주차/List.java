package src.자료구조_6주차;
public class List {
    private int size;
    private char array[];
    private static final int Max = 100;

    public List(){
        size = 0;
        array = new char[Max];
        for(int i = 0; i < Max; i++){
            array[i] = ' ';
        }
    }

    public boolean isEmpty(){
        if(size == 0)return true;
        else return false;
    }

    public int length(){
        size = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != ' ')size++;
        }
        return size;
    }

    public char retrieve(int j){
        return array[j];
    }

    public void replace(int j, char item){
        array[j] = item;
    }

    public void replaceByElem(char c, char c1){
        for(int i = 0; i < size; i++){
            if(array[i] == c)array[i] = c1;
        }
    }

    public void delete(int j){
        for(int i = j; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
    }

    public void deleteByElem(char c){
        for(int i = 0; i < length(); i++){
            if(array[i] == c){
                for(int j = i; j < array.length - 1; j++){
                    array[j] = array[j + 1];
                }
            }
        }
    }

    public void insert(int j, char k){
        for(int i = length() + 1; i > j; i--){
            array[i] = array[i - 1];
        }
        array[j] = k;
    }

    public void print(){
        System.out.println(array);
    }
}
