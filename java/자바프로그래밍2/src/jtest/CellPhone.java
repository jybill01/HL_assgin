package src.jtest;

public class CellPhone {
    private int telNum;
    private boolean power;
    private static int count;

    CellPhone(){
        this(0, true);
    }
    CellPhone(int telNum, boolean power){
        this.telNum = telNum;
        this.power = power;
        count++;
    }

    public void setTelNum(int telNum){
        this.telNum = telNum;
    }

    public int getTelNum(){
        return this.telNum;
    }

    public void setPower(String power){
        if(power == "on")this.power = true;
        else if (power == "off")this.power = false;
    }

    public String getPower(){
        if(this.power){
            return "on";
        }
        else{
            return "off";
        }
    }

    public String powerToggle(){
        if(power){
            power = false;
            return "off";
        }
        else{
            power = true;
            return "on";
        }
    }

    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "telNum=" + telNum +
                ", power=" + power +
                '}';
    }
}
