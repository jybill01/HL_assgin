package src.자료구조_21_06_07;

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
}
