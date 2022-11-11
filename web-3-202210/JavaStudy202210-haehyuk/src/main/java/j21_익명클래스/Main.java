package j21_익명클래스;

public class Main {

    public static void main(String[] args) {

        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();

        Interface1 interface4 = new Interface1() {
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
        };
        interface4.methodName();
    }
}
