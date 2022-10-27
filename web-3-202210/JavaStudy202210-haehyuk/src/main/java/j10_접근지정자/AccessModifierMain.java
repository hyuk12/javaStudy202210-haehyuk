package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20221027, "student1");
        sam.showInfo();
        sam.setName("student12");
        sam.showInfo();

        System.out.println(sam.getCode());

    }
}
