package j15_Object클래스;

/*

    모든 클래스는 Object 클래스를 상속 받는다.
    유일하게 import를 받지 않는 경우
    jdk > java.base > java >  이 하위에 있는 모든 lang들은 따로 import를 받지 않는다.
 */

public class ObjectTest extends Object{

    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String showInfo() {
        return "name: "  + name + "address: " + address;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
