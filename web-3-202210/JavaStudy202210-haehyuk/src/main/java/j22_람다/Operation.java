package j22_람다;

// 람다는 추상 메서드가 하나만 존재 해야하기 때문에 그 이상 쓸 수 없게 어노테이션을 달아둔다.
@FunctionalInterface
public interface Operation {
    public int calc(int x, int y);

    public default String resultToString(int result){
        return "결과: " + result;
    }
}
