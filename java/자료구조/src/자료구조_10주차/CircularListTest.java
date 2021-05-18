package src.자료구조_10주차;

public class CircularListTest {
    public static void main(String[] args){
        CircularList C1 = new CircularList();
        C1.addFirst('b');
        C1.print();
        C1.addFirst('a');
        C1.print();
        C1.addLast('d');
        C1.print();
        C1.insert(C1.listSearch('b'), 'c');
        C1.print();
        C1.delete(C1.listSearch('d'));
        C1.print();
        System.out.print(C1.size());
    }
}
