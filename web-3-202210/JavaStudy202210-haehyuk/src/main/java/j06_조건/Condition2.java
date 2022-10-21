package j06_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final  int VIP_POINT = 80;
        final  int GOLD_POINT = 60;
        final  int SILVER_POINT = 40;
        final  int BRONZE_POINT = 20;

        int point = 50;
        String rating = null;

        System.out.print("회원 포인트 점수를 입력하세요: ");
        point = sc.nextInt();

        if(point > VIP_POINT){
            rating = "VIP";
        }else if(point > GOLD_POINT){
            rating = "GOLD";
        } else if (point > SILVER_POINT) {
            rating = "SILVER";
        } else if (point > BRONZE_POINT) {
            rating = "BRONZE";
        } else {
            rating = "GENERAL";
        }
        System.out.println("회원의 등급: " + rating);

    }
}
