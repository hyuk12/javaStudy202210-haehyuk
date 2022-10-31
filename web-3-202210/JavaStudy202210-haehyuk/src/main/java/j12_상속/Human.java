package j12_상속;

public class Human extends Animal{

    public Human(String name) {
        super(name);
    }

    /*
     메소드 오버라이딩(오버라이드)
     재정의 한다.
     상위(Animal) 객체에 있는 메소드를 하위(Human) 객체에서 재정의 해서 쓴다
     */
    @Override // 해당 메소드가 상위 객체로 부터 재정의된 메소드입니다를 표기 하는 것
    public void move(){
//        super.move(); 상위 객체에 있는 메소드를 불러온다.
        System.out.println("두 발로 걷습니다.");
    }
}
