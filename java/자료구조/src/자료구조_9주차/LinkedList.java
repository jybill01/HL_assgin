package src.자료구조_9주차;

public class LinkedList {
    private int length;
    private ListNode firstNode;

    public LinkedList(){
        firstNode = new ListNode();
    }

    public LinkedList(Object val){
        firstNode = new ListNode(val);
    }

    public LinkedList(Object val, ListNode p){
        firstNode = new ListNode(val, p);
    }

    public int size(){
        ListNode p = firstNode;
        length = 0;
        while(p != null){
            length++;
            p = p.link;
        }
        return length;
    }

    public void addFirst(Object x){
        ListNode newNode = new ListNode();
        newNode.data = x;
        if(firstNode.data == null){
            firstNode = newNode;
            newNode.link = null;
        }
        else {
            newNode.link = firstNode;
            firstNode = newNode;
        }
    }

    public void insert(ListNode p, Object x){
        ListNode newNode = new ListNode();
        newNode.data = x;
        if(firstNode.data == null){
            firstNode = newNode;
            newNode.link = null;
        }
        else if(p == null){
            newNode.link = firstNode;
            firstNode = newNode;
        }
        else{
            newNode.link = p.link;
            p.link = newNode;
        }
    }

    public void addLast(Object x){
        ListNode newNode = new ListNode();
        ListNode p;
        newNode.data = x;
        newNode.link = null;
        if(firstNode == null) {
            firstNode = newNode;
            return;
        }
        p = firstNode;
        while(p.link != null){
            p = p.link;
        }
        p.link = newNode;
    }

    public void delete(ListNode p){
        if(firstNode == null){
            System.out.println("error");
            return;
        }
        if(p == null){
            firstNode = firstNode.link;
        }
        else{
            if(p.link == null)return;
            p.link = p.link.link;
        }
    }

    public void reverse(){
        ListNode p = firstNode;
        ListNode q = null;
        while(p != null){
            ListNode r = q;
            q = p;
            p = p.link;
            q.link = r;
        }
        firstNode = q;
    }

    public void concatList(LinkedList l2){
        if(this.firstNode == null)this.firstNode = l2.firstNode;
        else if(l2.firstNode == null)return;
        else{
            ListNode p = firstNode;
            while(p.link != null){
                p = p.link;
            }
            p.link = l2.firstNode;
        }
    }

    public ListNode listSearch(Object data){
        ListNode p = firstNode;
        while(p != null){
            if(p.data == data)return p;
            p = p.link;
        }
        return p;
    }

    public void deleteLastNode(){
        if(firstNode == null)return;
        if(firstNode.link == null)firstNode = null;
        else{
            ListNode p = firstNode;
            ListNode c = firstNode.link;
            while(c.link != null){
                c = c.link;
                p = p.link;
            }
            p.link = null;
        }
    }

    public void print(){
        ListNode p;
        System.out.printf("(");
        p = firstNode;
        while(p != null){
            System.out.printf("%s",p.data);
            p = p.link;
            if(p != null){
                System.out.printf(",");
            }
        }
        System.out.printf(")\n");
    }
}
