package j13_추상화.추상클래스;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("스마트폰");
        TabletFactory tabletFactory = new TabletFactory("태블릿");

        phoneFactory.produce("아이폰 14");
        tabletFactory.produce("아이패드 프로5");
    }
}
