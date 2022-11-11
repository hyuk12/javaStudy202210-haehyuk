package j22_람다;

// 람다는 메소드가 하나만 있어야 한다. 하나의 메소드만 있기 때문에 매개 변수가 확실히 어떤것이 들어가야 하는지 알고 있는 상황이라
// 자료형이 생략 가능하다 익명클래스의 생성과 구현이랑 비슷한데 람다는 생성되는 부분만 없고 나머지 부분은 동일하다.
public class OperationMain {

    public static void main(String[] args) {
        // add 와 add2의 작동방식은 같다
        int a = 10 , b = 20;

        Operation add = new Operation(){
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };
        Operation add2 = (x, y) -> x + y;

        Operation sub = (x, y) -> x - y;

        Operation multi = (x, y) -> x * y;

        Operation div = (x, y) -> x / y;


        System.out.println(sub.resultToString(sub.calc(b, a)));
        System.out.println(sub.resultToString(multi.calc(b, a)));
        System.out.println(sub.resultToString(div.calc(b, a)));


        int addResult = add.calc(a, b);
        System.out.println(a + " + " +  b +  " = " + addResult);

        int addResult2 = add2.calc(a, b);
        System.out.println(a + " + " +  b +  " = " + addResult2);
    }
}
