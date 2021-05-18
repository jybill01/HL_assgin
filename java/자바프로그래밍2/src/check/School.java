package src.check;

public abstract class School implements ICOVIDCheck{
    public abstract void openGeate();
    public void waitingPlace(String place) {
        System.out.println("선별 진료소 이동을 위한 " + place + "대기장소로 이동합니다.");
    }
}
