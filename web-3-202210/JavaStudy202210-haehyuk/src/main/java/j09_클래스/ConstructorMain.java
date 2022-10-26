package j09_클래스;

public class ConstructorMain {

    public static void main(String[] args) {

        Constructor c1 = new Constructor();

        c1.showInfo();
        System.out.println();
        Constructor c2 = new Constructor(10);
        c2.showInfo();
        System.out.println();
        Constructor c3 = new Constructor("sjsj");
        c3.showInfo();
        System.out.println();
        Constructor c4 = new Constructor(10,"ㅅㄷㄴㅅ");
        c4.showInfo();
        System.out.println();
    }
}
