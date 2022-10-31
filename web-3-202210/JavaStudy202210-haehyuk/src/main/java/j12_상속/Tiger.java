package j12_상속;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);

    }
    @Override// 해당 메소드가 상위 객체로 부터 재정의된 메소드입니다를 표기 하는 것
    public void move(){
        System.out.println("네 발로 뜁니다.");
    }

}
