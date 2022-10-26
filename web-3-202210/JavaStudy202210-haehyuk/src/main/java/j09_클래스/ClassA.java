package j09_클래스;



public class ClassA {

    int num;
    String name;
    double score;

    //기본생성자

    ClassA(){}

    // 기본 생성자 / 반환 자료형이 없고 클래스명과 같다. 항상 주소 값을 반환한다./ 항상 호출이 먼저 그 후 주소값 반환./
    // 오버 로딩된 생성자가 하나라도 있으면 기본생성자는 사라진다
    ClassA(int a){
        System.out.println("a" + a);
        System.out.println("ClassA를 생성합니다.");
    }


    void callName(){
        System.out.println(name + "을(를) 부릅니다.");
    }

}
