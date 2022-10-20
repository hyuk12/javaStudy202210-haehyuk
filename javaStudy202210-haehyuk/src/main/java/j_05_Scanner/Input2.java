package j_05_Scanner;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x 입력: ");
        int x = sc.nextInt();

        System.out.print("y 입력: ");
        int y = sc.nextInt();

        System.out.println("x + y = " + (x + y));
    }
}
