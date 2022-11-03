package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
// 상수가 하나라도 있을 경우 NoArgsConstructor 는 있을수 없다.
public class PersonRequired {
    private final String name; // 멤버변수에 final 을 선언하면 필수값이 된다.
    private int age;


}
