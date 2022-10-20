package j_05_Scanner;

import java.util.Scanner;

public class Input3 {
    /*
        이름: 김준일                     name
        나이: 21                        age
        주소: 부산 동래구 사직동           address
        연락처: 010 9988 1916           phone

        사용자의 이름은 김준일이고 나이는 29입니다.
        주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address= null;
        String phone = null;

        System.out.print("이름: ");
        name = sc.next();

        System.out.print("나이: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("주소: ");
        address = sc.nextLine();

        System.out.print("연락처: ");
        phone = sc.nextLine();



        System.out.println("사용자의 이름은 " + name + "이고 나이는" + age + "입니다."
                + "\n주소는 " + address + "이며 연락처는 " + phone + "입니다.");
    }
}
