package j13_추상화.인터페이스;

// 원하는 기능을 골라서 사용하기위한 패턴 어댑터 패턴
public abstract class Button implements Press, Up, Down {
    // 템플릿 메서드
    @Override
    public void onDown() {}

    @Override
    public void onPressed() {}

    @Override
    public void onUp() {}
}
