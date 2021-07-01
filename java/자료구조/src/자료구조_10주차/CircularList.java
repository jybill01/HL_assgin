package src.자료구조_10주차;

public class CircularList {
    private int length;
    private ListNode tail;

    public CircularList(){
        tail = null;
        length = 0;
    }

    public int size(){
        return length;
    }

    public void addFirst(Object x){
        ListNode newNode = new ListNode(x);
        if(tail == null){
            tail = newNode;
            newNode.link = tail;
        }
        else{
            newNode.link = tail.link;
            tail.link = newNode;
        }
        length++;
    }

    public void insert(ListNode p, Object x){
        ListNode newNode = new ListNode(x);
        if(tail == null){
            tail = newNode;
            newNode.link = tail;
        }
        else if(p == null){
            newNode.link = tail.link;
            tail.link = newNode;
        }
        else{
            newNode.link = p.link;
            p.link = newNode;
        }
        length++;
    }

    public void addLast(Object x){
        ListNode newNode = new ListNode(x);
        if(tail == null){
            tail = newNode;
            newNode.link = tail;
        }
        else {
            newNode.link = tail.link;
            tail.link = newNode;
            tail = newNode;
        }
        length++;
    }

    public void delete(ListNode p){
        if(tail == null){
            System.out.println("error");
            return;
        }
        if(p == null){
            tail.link = tail.link.link;
        }
        else{
            if(p.link == null)return;
            p.link = p.link.link;
        }
        length--;
    }

    public ListNode listSearch(Object x){
        ListNode p = tail.link;
        while(p != tail){
            if(p.data == x)return p;
            p = p.link;
        }
        return p;
    }

    public void print(){
        ListNode p;
        System.out.print("(");
        p = tail.link;
        for(int i = 0; i < length; i++){
            System.out.print(p.data);
            p = p.link;
            if(p != tail.link){
                System.out.printf(",");
            }
        }
        System.out.print(")\n");
    }
}
