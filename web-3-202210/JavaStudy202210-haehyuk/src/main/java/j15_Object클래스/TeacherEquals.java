package j15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {
        j15_Object클래스.equals.Teacher teacher1
                = new j15_Object클래스.equals.Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준일", "코리아아이티");


//        System.out.println(teacher1 == teacher2); // 자료형 자체가 다르기에 주소값 비교가 불가능하다.
        System.out.println(teacher1.equals(teacher2)); // 동일 자료형이어야한다.
        System.out.println(teacher1.hashCode() == teacher2.hashCode()); // 객체의 형태는 상관없이 만들어진 값만이 비교대상이다.
    }
}
