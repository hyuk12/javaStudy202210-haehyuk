package baekjun.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  9개의 배열 크기를 가지는 변수
 *  서로다른 9개의 자연수를 넣는다
 *  그중에 최댓값을 찾고 그 최댓값의 index값을 찾아라
 */
public class MaxNumber {
    public static void main(String[] args) throws IOException {
        // 여기서 필요한 것은 비교 대상/ 가장 큰값 인덱스
        // 버퍼 리더를 사용할 때에 메인 함수에 throws IOException 시켜주기 .
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 9개의 배열 크기를 가지는 arr 생성
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0; // 최댓값 들어갈 변수
        int index = 0; // 인덱스 들어갈 변수
        int count = 0; // 카운트 변수

        // arr이라는 배열을 돌면서 카운트를 하나씩 늘려라!
        // 늘리면서 만약에 값이 max 보다 크다면 그 max 에 value 를 넣어라
        // max 값은 초기 0 이기 때문에 순차적으로 배열이 돌면서 값을 비교해서 가장높은 값이 들어오면 if 문을 빠져나오면서
        // index 값은 카운트 값과 동일하게 된다.
        for (int value : arr){
            count++;
            if (value > max){
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
