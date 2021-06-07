package src.자료구조_21_06_07;

public class Queue_array {
    private String[] item;
    int front, rear;
    int max = 5;

    public Queue_array(){
        item = new String[max];
        front = 0;
        rear = 0;
    }

    public void enqueue(String x){
        if((rear + 1) % max == front) return;
        else{
            rear = (rear + 1) % max;
            item[rear] = x;
        }
    }

    public String dequeue(){
        if(front == rear) return null;
        else{
            front = (front + 1) % max;
            return item[front];
        }
    }

}
