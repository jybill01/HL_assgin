package src.자료구조_21_05_31;

public class Stack {
    public ListNode top;

    public void push(String x){
        ListNode newNode = new ListNode(x, top);
        newNode.data = x;
        newNode.link = top;
        top = newNode;
    }

    public String pop(){
        if(top == null)return null;
        String temp = top.data;
        top = top.link;
        return temp;
    }
}
