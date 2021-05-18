package src.기본API;

import java.util.Random;

public class Dice {
    public static void main(String[] args){
        Random dice = new Random();
        for(int i = 0; i < 5; i++){
            System.out.println("주사위를 굴립니다 -> 현재 주사위 상태 : " + (dice.nextInt(6) + 1));
        }
    }
}
