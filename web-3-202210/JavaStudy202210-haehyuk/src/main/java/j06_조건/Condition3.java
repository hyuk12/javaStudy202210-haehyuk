package j06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;       // 시험점수
        String grade = null; // 학점(등급)

        System.out.print("점수를 입력하세요: ");
        score = sc.nextInt();
        // 조건
        /*
        만약에 score 가 0보다 작거나 100보다 크면 grade는 X
        score -> 90~100  grade = a학점
        score -> 80~89  grade = b학점
        score -> 70~79  grade = c학점
        score -> 60~69  grade = d학점
        score -> 0~59  grade = f학점

        입력한 점수는 00 이며 학점은 0학점입니다.
        * */

        if (score < 0 || score > 100) {
            grade = "X";
        }else if (score > 89) {
            grade = "A학점";
        }else if (score > 79) {
            grade = "B학점";
        }else if (score > 69) {
            grade = "C학점";
        }else if (score > 59) {
            grade = "D학점";
        }else {
            grade = "F학점";
        }
        System.out.println("입력한 점수는 " + score + "점이며 학점은 " + grade + "입니다.");


    }
}
