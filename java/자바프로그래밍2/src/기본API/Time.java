package src.기본API;

public class Time {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("start time = " + startTime);
        for(int i = 1; i <= 10000; i++){
            System.out.println(".");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("end time = " + endTime);
        System.out.println("만 번 점을 출력하는 시간 = " + (endTime - startTime) + "mili sec");
    }
}
