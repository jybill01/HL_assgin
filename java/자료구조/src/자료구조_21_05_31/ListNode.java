package src.자료구조_21_05_31;

public class ListNode {
    String data;
    ListNode link;

    public ListNode(){
        data = null;
        link = null;
    }

    public ListNode(String val){
        data = val;
        link = null;
    }

    public ListNode(String val, ListNode p){
        data = val;
        link = p;
    }
}
