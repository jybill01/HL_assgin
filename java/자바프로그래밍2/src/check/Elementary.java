package src.check;
public class Elementary extends School{
    private String stdname;
    private double stdfever;

    Elementary(Student obj){
        this.stdname = obj.name;
        this.stdfever = obj.fever;
    }

    @Override
    public void openGeate() {
        System.out.println("Elementary 정문을 엽니다.");
    }

    @Override
    public boolean feverCheck() {
        if(stdfever > 36.5){
            System.out.println(stdname + stdfever + " -> 부모님께 전화를 드립니다.");
            return true;
        }
        else {
            System.out.println(stdname + stdfever + " -> 교실로 이동합니다.");
            return false;
        }
    }
}
