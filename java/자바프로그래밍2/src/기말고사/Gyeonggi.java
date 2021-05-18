package src.기말고사;

public class Gyeonggi extends Thread{
    private CountCovid count_covid;

    Gyeonggi(CountCovid cc){
        this.count_covid = cc;
    }

    public void run(){
        for(int i = 2; i < 5; i++){
            try{
                count_covid.sumofday("Gyeonggi", i * 10);
            }catch(SocialDistancingException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
