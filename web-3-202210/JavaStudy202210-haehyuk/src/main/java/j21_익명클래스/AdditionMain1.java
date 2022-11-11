package j21_익명클래스;

public class AdditionMain1 {

    public static void main(String[] args) {
        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        // 본래 인터페이스는 구현이 불가능 하기에 구현체 즉 구현 클래스를 따로 만들어서 new 해줘야 하지만
        // 인터페이스를 new 하는 시점에서 재사용이 불가능한 임시 클래스를 만들어 생성과 구현을 한번에 한다. 이것이 익명 클래스
        // 클래스 명이 없기에 영구적이지 않고 일회용 클래스라고 보면된다.
        // 반복적으로 인터페이스를 통해 구현해야할 것이 있다면 클래스로 따로 구현을 하고 그게 아니라 한번만 사용될 것이면 굳이 클래스를 늘리지 말고 익명클래스를 사용한다. 추상클래스도 가능하다.
        Addition<Integer> integerAddition = new Addition<Integer>(){

            @Override
            public Integer add(Integer values) {
                return null;
            }
        };
    }
}
