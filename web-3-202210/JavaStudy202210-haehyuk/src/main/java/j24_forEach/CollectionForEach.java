package j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for (String name : list) {
            System.out.println(name);
        }

        list.forEach(System.out::println);

        // 밑의 로직을 한번에 정리 한 것이 위의 코드이다.
        Consumer<String> consumer = System.out::println;
        for (String name :  Objects.requireNonNull(list)) {
            consumer.accept(name);
        }

        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < 100; i++){
            numbers.add(i + 1);
        }

        AtomicInteger result = new AtomicInteger();

        numbers.forEach(result::addAndGet);
        System.out.println(result.get());

        Map<Integer, String> students = new TreeMap<>();
        for (int i = 0 ; i < 10 ; i++){
            students.put(20220001 + i, "김준" + (i + 1));
        }
        students.forEach((key, value) ->{
            System.out.println("학번: " + key + ", 이름: " + value);
        });
    }
}
