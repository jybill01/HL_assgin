package src.기말고사;

public class Seoul extends Thread{
    private CountCovid count_covid;

    Seoul(CountCovid cc){
        this.count_covid = cc;
    }

    public void run(){
        for(int i = 2; i < 5; i++){
            try{
                count_covid.sumofday("Seoul", i * 20);
            }catch(SocialDistancingException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
