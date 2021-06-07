package src.자료구조_21_06_07;

public class Queue {
    public ListNode front, rear;

    public void enqueue(String x){
        ListNode newNode = new ListNode(x, null);
        if(rear == null){
            rear = newNode;
            front = newNode;
        }
        else {
            rear.link = newNode;
            rear = newNode;
        }
    }

    public String dequeue(){
        if(front == null)return null;
        String temp = (String) front.data;
        front = front.link;
        if(front == null)rear = null;
        return temp;
    }
}
