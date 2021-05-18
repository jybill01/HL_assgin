package src.Phone;

public class Phone {
    private String maker;
    private double price;
    private String type;

    public Phone(){
        this("NONE", 0.0, "anyG");
    }

    public Phone(String m, double p, String t){
        this.maker = m;
        this.price = p;
        this.type = t;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "maker='" + maker + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
