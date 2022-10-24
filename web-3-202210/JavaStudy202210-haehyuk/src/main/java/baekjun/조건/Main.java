package baekjun.조건;

import java.util.Scanner;

// 인공지능 오븐 개발
/*
 오븐 구이가 끝나는 시간을 분 단위로 자동적으로 계산 요리가 끝나는 시각 알려주는 디지털 시계
 시작하는 시각과 구이를 하는 데 필요한 시간이 분단위로 주어졌을 때 오븐구이가 끝나는 시간을 계산하는 프로그램
 입력: 첫줄에는 현재 시각 A(0 <= A <= 23)시 와 B(0<=B<=59)분 정수!
 두번째 줄에는 C(0<= C <= 1,000) 분단위

 출력: 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력 (단, 시는 0부터 23까지 정수 분은 0부터 59까지정수 23시 59분에서 1분지나면 0시 0분)

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a * 60 + b + c;
        a= (min/60) % 24;
        b = min % 60;
        System.out.println(a + " " + b);
        sc.close();
    }
}
