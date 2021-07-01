package src.Phone;

public class PhoneTest {
    public static void main(String[] args){
        Phone [] p = new Phone[5];
        p[0] = new Phone("LG", 500, "2G");
        p[1] = new SmartPhone(100, true);
        p[2] = new Phone();
        p[3] = new SmartPhone();
        p[4] = new Phone();

        for(Phone obj : p){
            System.out.println(obj);
        }
    }
}
