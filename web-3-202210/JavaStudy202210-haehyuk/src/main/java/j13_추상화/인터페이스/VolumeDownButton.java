package j13_추상화.인터페이스;

public class VolumeDownButton extends Button {

    @Override
    public void onPressed() {
        System.out.println("음량을 한칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("음량을 계속 내립니다.");
    }
}
