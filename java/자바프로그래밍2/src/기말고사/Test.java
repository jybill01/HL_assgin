package src.기말고사;

public class Test {
    public static void main(String[] args){
        CountCovid cc = new CountCovid();
        Thread t1 = new Thread(new Kangwon(cc));
        Thread t2 = new Thread(new Seoul(cc));
        Thread t3 = new Thread(new Gyeonggi(cc));
        t1.start();
        t2.start();
        t3.start();
    }
}
