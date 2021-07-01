package src.자료구조_13주차;

public class Stack {
    public ListNode top;

    public void push(Object x){
        ListNode newNode = new ListNode(x, top);
        newNode.data = x;
        newNode.link = top;
        top = newNode;
    }

    public Object pop(){
        if(top == null)return null;
        Object temp = top.data;
        top = top.link;
        return temp;
    }
}
