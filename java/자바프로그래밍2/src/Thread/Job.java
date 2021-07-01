package src.Thread;

public class Job extends Thread{
    private String name;
    int num = 0;

    public Job(String name){
        this.name = name;
    }

    public void run(){
        while(true){
            try {
                Thread.sleep(500);
                int nnum = getNum();
                System.out.println(name + " : " + nnum);
                if(10 <= nnum)
                    break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getNum(){
        return num++;
    }
}
