package j14_참조자료형캐스팅;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        Led led = new Led();
        Speaker speaker = new Speaker();

        CentralControl centralControl = new CentralControl(led, speaker, computer3);

        centralControl.powerOn();
        System.out.println("--------------------------------");
        centralControl.powerOff();
    }
}
