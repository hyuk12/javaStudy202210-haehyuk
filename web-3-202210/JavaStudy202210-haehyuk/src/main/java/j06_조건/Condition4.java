package j06_조건;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String selected = null;

        System.out.println("[선택 프로그램]");
        System.out.println("[a. 메뉴1]");
        System.out.println("[b. 메뉴2]");
        System.out.println("[c. 메뉴3]");
        System.out.println("[d. 메뉴4]");
        System.out.println("[e. 메뉴5]");
        System.out.print("실행 할 명령을 선택하세요: ");
        selected = sc.nextLine();

        switch (selected) {
            case "a":
                System.out.println("메뉴1을(를) 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴2을(를) 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴3을(를) 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴4을(를) 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴5을(를) 선택하셨습니다.");
        }
    }
}
