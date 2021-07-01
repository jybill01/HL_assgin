package src.jtest;

import src.jtest.CellPhone;

import java.util.Scanner;

public class CellPhoneTest {
    public static void main(String[] args) {
        CellPhone[] phones = new CellPhone[5];
        phones[0] = new CellPhone();
        phones[1] = new CellPhone(1, false);
        for(int i = 2; i < 5; i++){
            phones[i] = new CellPhone(i, true);
        }
        phones[2].setPower("off");

        for(CellPhone c : phones){
            System.out.println(c);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("전원 상태를 알고싶은 전화번호를 입력하세요 : ");
        int n = input.nextInt();
        for(CellPhone c : phones){
            if(c.getTelNum() == n)System.out.println(c.getPower());
        }
    }
}
