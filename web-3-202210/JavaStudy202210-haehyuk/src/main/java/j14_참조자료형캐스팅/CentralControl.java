package j14_참조자료형캐스팅;

/* 중앙제어 */
public class CentralControl {


    Power[] powers = new Power[3];



    public CentralControl(Power device1, Power device2, Power device3) {
        powers[0] = device1;
        powers[1]  = device2;
        powers[2]  = device3;
    }


    public void powerOn(){
        for(int i = 0; i < powers.length; i++){
            powers[i].on();
        }
    }

    public void powerOff() {
        for(int i = 0; i < powers.length; i++){
            powers[i].off();
        }
    }
}
