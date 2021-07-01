package src.jtest;

import src.jtest.Dog;

public class DogTest {

    public static void main(String[] args) {

        Dog dog1 = new Dog(); //생성자

        System.out.println("dog1=" + dog1); //toString()

        System.out.println(" -> dog의 총 마리수는 " + Dog.getTotal() + "마리 입니다.");



        Dog dog2 = new Dog(); //생성자

        System.out.println("dog2=" + dog2); //toString()

        System.out.println(" -> dog의 총 마리수는 " + Dog.getTotal() + "마리 입니다.");



        int foodcnt = 5;

        if(dog2.sleeping(5)) {

            System.out.println(" -> dog2 잠자는데 깨우지 말라고 합니다");

        }

        else {

            System.out.println(" -> dog2 간식을 주셨는데 자면 안되죠ㅎㅎ 간식 감사합니다^^");

        }



        System.out.println("\nhungry() Test");

        if(dog1.hungry()) System.out.println(" -> dog1 간식이 부족합니다.");

        else System.out.println(" -> dog1 간식이 충분합니다.");



        if(dog2.hungry()) System.out.println(" -> dog2 간식이 부족합니다.");

        else System.out.println(" -> dog2 간식이 충분합니다.");



        System.out.println("\nbarking() Test");

        System.out.println(" -> dog1 bark : " + dog1.barking());

        System.out.println(" -> dog2 bark : " + dog2.barking());

    }

}

