package src.check;

public class SchoolTest {
    public static void main(String[] args){

        Student std[] = {
                new Student("ele", "benny", 36.5),
                new Student("ele", "jhon", 37.5),
                new Student("uni", "daniel", 36.5),
                new Student("uni", "grace", 38),
                new Student(),
        };

        School anyschool [] = new School[5];

        for(int i = 0; i < std.length; i++){
            if(std[i].schooltype.equals("ele")){
                anyschool[i] = new Elementary(std[i]);
            }
            else {
                anyschool[i] = new Universtiy(std[i]);
            }
        }
        for(School obj : anyschool){
            System.out.println("===========================");

            obj.openGeate();

            boolean fever = obj.feverCheck();
            if( fever && obj instanceof Elementary) {
                obj.waitingPlace("교문 옆");
            }
            else if( fever && obj instanceof Universtiy) {
                obj.waitingPlace("서문 옆");
            }
        }
    }
}
