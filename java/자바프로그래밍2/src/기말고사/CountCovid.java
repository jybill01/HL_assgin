package src.기말고사;

public class CountCovid {
    private int confirmors;//누적확진 수

    void sumofday(String name, int a) throws SocialDistancingException{
        confirmors += a;
        if(confirmors >= 200)
            throw new SocialDistancingException(3);
        else if(confirmors < 200)
            throw new SocialDistancingException(2);
        else if(confirmors < 100)
            throw new SocialDistancingException(1);
        else if( confirmors < 50)
            System.out.println("마스크 착용을 생활화 하세요.");

    }
}
