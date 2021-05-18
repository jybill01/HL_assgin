package src.check;

public class Universtiy extends School{
    private String stdname;
    private double stdfever;

    Universtiy(Student obj) {
        this.stdname = obj.name;
        this.stdfever = obj.fever;
    }

    @Override
    public void openGeate() {
        System.out.println("Universtiy 정문을 엽니다.");
    }

    @Override
    public boolean feverCheck() {
        if(stdfever > 36.5){
            System.out.println(stdname + stdfever + " -> offline 수업에 참여합니다.");
            return true;
        }
        else {
            System.out.println(stdname + stdfever + " -> 강의실 수업에 참여합니다.");
            return false;
        }
    }
}
