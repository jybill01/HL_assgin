package src.자료구조_10주차;

public class ListNode {
    Object data;
    ListNode link;

    public ListNode(){
        data = null;
        link = null;
    }

    public ListNode(Object val){
        data = val;
        link = null;
    }

    public ListNode(Object val, ListNode p){
        data = val;
        link = p;
    }

    public void putData(Object n){
        data = n;
    }

    public Object getData(){
        return data;
    }

    public void putLink(ListNode next){
        link = next;
    }

    public ListNode getLink(){
        return link;
    }
}
