package src.기말고사;

public class SocialDistancingException extends Exception {

    SocialDistancingException(int a){
        if(a == 1){
            System.out.println("사회적 거리두기 1단계 입니다.");
        }
        else if(a == 2){
            System.out.println("사회적 거리두기 2단계 입니다");
        }
        else if(a == 3){
            System.out.println("사회적 거리두기 3단계 입니다");
        }
    }
}
