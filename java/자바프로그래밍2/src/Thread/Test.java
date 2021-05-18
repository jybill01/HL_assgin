package src.Thread;

public class Test {
    public static void main(String[] args){
        Job firstJob = new Job("firstJob");
        Job secondJob = new Job("SecondJob");

        System.out.println("학번 : 20205195, 이름 : 신준용");
        firstJob.start();
        secondJob.start();
    }
}
