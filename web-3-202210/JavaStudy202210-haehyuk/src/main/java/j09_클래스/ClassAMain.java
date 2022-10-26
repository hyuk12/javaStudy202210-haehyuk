package j09_클래스;



public class ClassAMain {

    public static void main(String[] args) {

//        System.out.println(new ClassA());
//        System.out.println(new ClassA());
//        System.out.println(new ClassA());
//        System.out.println(new ClassA());

        ClassA a1 = new ClassA(1);
        ClassA a2 = new ClassA();

        a1.name = "j_h";
        a2.name = "h_h";

        System.out.println(a1.name);
        System.out.println(a2.name);

        a1.callName();
        a2.callName();


    }
}
