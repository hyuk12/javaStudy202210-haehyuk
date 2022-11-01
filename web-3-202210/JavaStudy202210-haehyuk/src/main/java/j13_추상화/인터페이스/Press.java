package j13_추상화.인터페이스;

/*
    Interface란 ?
    1. 기본적으로 모든 메소드가 추상메소드로 정의된다.
    2. jdk 8버전 이후로 default 를 이용하면 일반 메소드도 interface에 넣을수 있다.
    3. 생성자 정의가 불가능하다.
    4. 일반 변수 선언 불가능하다.
    5. 상수 선언은 가능하다 public만 가능 private 불가능
 */

public interface Press {

    public final String NAME = "button";

    public void onPressed();

//    private String name;  변수 선언도 불가하다
    // jdk 8버전 이후로 default 를 이용하면 일반 메소드도 interface에 넣을수 있다.
//    public default void pop(){
//
//    }
}
