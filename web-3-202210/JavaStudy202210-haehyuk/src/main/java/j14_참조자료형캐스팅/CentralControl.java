package j14_참조자료형캐스팅;

/* 중앙제어 */
public class CentralControl {


    Power[] powers = new Power[3];

    private Power device1;
    private Power device2;
    private Power device3;

    public CentralControl(Power device1, Power device2, Power device3) {
        powers[0] = device1;
        powers[1]  = device2;
        powers[2]  = device3;
    }



    public void powerOff() {
        device1.off();
        device2.off();
        device3.off();
    }
}
