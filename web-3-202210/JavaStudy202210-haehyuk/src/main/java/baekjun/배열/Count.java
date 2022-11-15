package baekjun.배열;
/**
 *  첫째로 제공되는 것은 배열의 크기
 *  둘째로 들어 가는 것은 배열안에 들어갈 변수들
 *  셋째는 찾을 변수값
 *  출력은 찾은 변수값 갯수
 */


import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] array ;
        int count = 0;
        array = new int[sc.nextInt()] ;

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();

        }
        int value = sc.nextInt();
        for (int j : array) {
            if (value == j) {
                count++;
            }
        }
        System.out.println(count);
    }
}

