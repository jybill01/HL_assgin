package src.자료구조_21_06_07;

public class Deque {

    DNode  head, tail;

    public Deque(){
        head = new DNode();
        tail = new DNode();
        head.rlink = tail;
        tail.llink = head;
    }

    public void insertFirst(String x){
        DNode newNode = new DNode();
        newNode.data = x;
        newNode.rlink = head.rlink;
        newNode.llink = head;
        head.rlink.llink = newNode;
        head.rlink = newNode;
    }

    public String deleteFirst(){
        String temp = (String) head.rlink.data;
        head.rlink.rlink.llink = head;
        head.rlink = head.rlink.rlink;
        return temp;
    }

}
