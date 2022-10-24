package baekjun.출력및사칙;

import java.util.Scanner;

public class Problem3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {1,1,2,2,2,8};


        for (int i = 0; i < array.length; i++){
            int number = scanner.nextInt();
            if(number >=0 ){
                array[i] -= number;
            }
            System.out.println(array[i]);
        }
        scanner.close();
    }
}
