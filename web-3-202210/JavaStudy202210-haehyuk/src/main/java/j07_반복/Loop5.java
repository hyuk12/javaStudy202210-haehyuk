package j07_반복;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {

        /*
        2~9단
         */



        for (int i = 0; i < 8; i++) {

            int dan = i + 2;
            System.out.println("\n" + dan + "단\n" + "==========");

            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + " X " + num + " = " + (dan * num));
            }
            System.out.println("==========");
        }
    }
}
