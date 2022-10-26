package j09_클래스;

/*
 자바는 전역변수보다 지역변수가 우선시 된다.
 */
public class Constructor {

    // 멤버 변수
    int num ;
    String name;

    Constructor(){
        System.out.println("NoArgsConstructor(기본 생성자)");
    }

    Constructor(int num){
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 가지는 생성자)");
        this.num = num;
    }

    Constructor(String name){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 가지는 생성자)");
        this.name = name;
    }
    Constructor(int num, String name){
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }
    void showInfo(){
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }
}
