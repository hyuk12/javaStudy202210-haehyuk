package j15_Object클래스;

public class Main {

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("java","java.io");

        int hashCode = objectTest.hashCode();

        System.out.println(hashCode);
        System.out.println(Integer.toHexString(hashCode));

        System.out.println(objectTest);


    }
}
