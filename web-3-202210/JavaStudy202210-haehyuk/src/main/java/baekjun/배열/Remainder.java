package baekjun.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 *  각 정수들을 받아서 42를 나눴을 때 나머지가 다른 원소 의 갯수를 구하는 문제
 *  set 의 특징은 같은 값은 들어갈 수 없다는 것을 응용!
 *  결국 받아오는 값의 42를 나눈 나머지를 set 에 넣으면
 *  안에는 중복되지 않는 값들만 남아 있기 때문에 그대로 set 의 사이즈를 출력 해주면 된다.
 */
public class Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(h.size());
        
        // 다른 방법
        /**
         *  boolean 타입을 이용한 배열을 만든다 boolean 타입의 기본값은 false 이다.
         *  그러므로 배열로 받은 값 들을 42로 나누어 이 것이 true 라면 count 를 하는 방법으로 풀어본다.
         */
        boolean[] h2 = new boolean[42];
        for (int i = 0; i < 10; i++){
            h2[Integer.parseInt(br.readLine()) % 42] = true;
        }
        int count = 0;
        for (boolean value : h2){
            if (value){
                count++;
            }
        }
        System.out.println(count);
    }
}
