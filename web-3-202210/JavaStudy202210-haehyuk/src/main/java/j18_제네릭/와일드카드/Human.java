package j18_제네릭.와일드카드;

public class Human extends Animal{

    @Override
    public void move() {
        System.out.println("두 발로 걷습니다."); // 오버라이딩
    }
    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
