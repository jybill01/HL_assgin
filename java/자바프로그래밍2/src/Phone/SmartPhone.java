package src.Phone;

public class SmartPhone extends Phone{
    private int memory;
    private boolean hasBluetooth;

    public SmartPhone(){
        this(0, false);
    }

    public SmartPhone(int memory, boolean hasBluetooth){
        this.memory = memory;
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        String rst = super.toString();
        return rst +  "SmartPhone{" +
                "memory=" + memory +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }
}
