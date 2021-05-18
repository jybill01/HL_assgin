package src.자료구조_9주차;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList L1 = new LinkedList();
        LinkedList L2 = new LinkedList('d');
        L1.insert(null, 'b');
        L1.print();
        L1.addFirst('a');
        L1.print();
        L1.insert(L1.listSearch('b'), 'c');
        L1.print();
        L1.delete(L1.listSearch('b'));
        L1.print();
        L1.addLast('c');
        L1.print();
        L1.reverse();
        L1.print();
        L1.reverse();
        L1.print();
        L1.concatList(L2);
        L1.print();
        System.out.println(L1.size());
        L1.deleteLastNode();
        L1.print();
    }
}
