package j14_참조자료형캐스팅.동물;

public class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
