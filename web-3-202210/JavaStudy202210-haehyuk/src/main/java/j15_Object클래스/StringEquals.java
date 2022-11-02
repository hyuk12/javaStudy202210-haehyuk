package j15_Object클래스;

public class StringEquals {

    public static void main(String[] args) {
        String name1 = "java";
        String name2 = "java";

        String name3 = new String("java");
        String name4 = new String("java");

        System.out.println(name1 + " " + name2 + " " + name3);
        System.out.println(name1 == name2); // 이 둘이 같은이유는 변수에 값이 담겨있는 개념으로 담겨 있는 값이 같기때문에(string은 기본적으로 각각의 char를 모은 집합체) true값을 반환하고
        System.out.println(name1 == name3); // 이 둘이 다른이유는 새로운 값을 new를 통해 메모리를 할당 하기 때문에 주소값이 다르다.
        System.out.println(name3 == name4); // 이 둘이 다른이유는 새로운 값을 new를 통해 메모리를 할당 하기 때문에 주소값이 다르다.

        System.out.println(name1.equals(name3)); // 할당 되어 있는 공간안에 있는 리터럴 상수값을 비교 true
    }
}
