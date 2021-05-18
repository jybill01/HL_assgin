package src.자료구조_6주차;

public class ListTest {
    public static void main(String[] args){
        char[] A = {'A', 'T', 'Q'};
        List list = new List();
        System.out.println(list.isEmpty());
        for(int i = 0; i < 30; i++){
            list.insert(i, A[i % 3]);
        }
        list.print();
        System.out.println(list.isEmpty());
        System.out.println(list.retrieve(5));
        list.replace(5, 'Z');
        list.replaceByElem('T', 'U');
        list.print();
        list.delete(5);
        list.deleteByElem('A');
        list.print();
    }
}
