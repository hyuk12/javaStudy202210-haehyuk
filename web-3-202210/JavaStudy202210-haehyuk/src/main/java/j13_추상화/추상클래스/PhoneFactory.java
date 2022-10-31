package j13_추상화.추상클래스;

public class PhoneFactory extends Factory{

    public PhoneFactory(String name) {
        super(name);
        printInfo();
    }

    @Override
    public void produce(String model){
        System.out.println("[ " + model + " ]모델 스마트폰을 생산합니다.");
    }

    @Override
    public void management() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
