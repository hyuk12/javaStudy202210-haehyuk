package j16_Bean;

// 상수가 하나라도 있을 경우 NoArgsConstructor 는 있을수 없다.
public class Person {
    private final String name; // 멤버변수에 final 을 선언하면 필수값이 된다.
    private int age;

    // public Person(){} <- NoArgsConstructor : requiredArgsConstructor 랑 같이 쓸 수 없다.
    public Person(String name){     //<- requiredArgsConstructor
        this.name = name;

    }

    public Person(String name, int age) {       //<- AllArgsConstructor
        this.name = name;
        this.age = age;
    }
}
