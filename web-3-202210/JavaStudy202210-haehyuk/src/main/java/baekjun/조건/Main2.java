package baekjun.조건;

import java.util.Scanner;

/*
 1~6까지 있는 주사위 3개를 던져서
 1. 같은눈이 3개가 나오면 10,000원 + (같은눈)x1000원의 상금
 2. 같은눈이 2개가 나오면 1,000원 + (같은눈)x100원의 상금
 3. 모두다를경우 가장큰눈 x 100원의 상금
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        int price;
        if(f == s && s == t){
            price = 10000 + f * 1000; 
        } else if (f == s) {
            price = 1000 + f * 100;
        } else if (s == t){
            price = 100 + s * 100;
        }else if (t == f){
            price = 10 + t * 100;
        }else{
            if(f > s && f > t){
                price = f * 100;
            } else if (s > f && s > t) {
                price = s * 100;
            } else{
                price = t * 100;
            }
        }
        System.out.println(price);
        sc.close();
    }
}
