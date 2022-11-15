package baekjun.반복문;

import java.util.Scanner;

/**
 * 영수증에 적힌,
 *
 * 구매한 각 물건의 가격과 개수
 * 구매한 물건들의 총 금액
 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사
 *
 */
public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, n;
        x = sc.nextInt();
        n = sc.nextInt();


        for(int i = 0; i < n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            x = x - (a * b);
        }
        if (x == 0){
            System.out.println("yse");
        }else System.out.println("no");
    }

}
