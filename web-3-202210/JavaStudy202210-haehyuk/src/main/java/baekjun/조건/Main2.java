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

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a != b && b != c && c != a){
            int max;
            //c > a > b
            if (a > b){
                // a (b,c)
                max = Math.max(c, a);
            }else{
                //c >  b  > a
                max = Math.max(c, b);
            }
            System.out.println(max * 100);
        }else{
            if ( a == b && a == c){
                System.out.println(a * 1000 + 10000);
            }else {
                if (a == b || a == c){
                    System.out.println(1000 + a * 100);
                }else {
                    System.out.println(1000 + b * 100);
                }
            }
        }


        sc.close();
    }
}
