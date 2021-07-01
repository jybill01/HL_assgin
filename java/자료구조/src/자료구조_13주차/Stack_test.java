package src.자료구조_13주차;

public class Stack_test {
    private ListNode top;
    private ListNode f;

    public void push(int item){
        ListNode newNode = new ListNode();
        newNode.data = item;

        if(top == null){
            top = newNode;
            f = newNode;
        }
        else{
            top.link = newNode;
            top = newNode;
        }
    }

    public int pop(){
        ListNode p = f;
        if(top == null)return -10000;
        int n = (int) top.data;
        while(p.link != top)p = p.link;
        top = p;
        return n;
    }
}
