package baekjun.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  교실에  학생이 30명이 있고 각 학생별로 1~30까지 번호가 있다
 *  교수님이 내준 특별과제를 28명이 제출 하였고 제출하지 않은 두명의 학생을 찾아라
 *  그리고 출력할 때는 낮은 숫자가 먼저 출력한다.
 */
public class HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];

        // 과제를 낸 학생들의 수만큼 배열에 집어 넣는다
        for (int i = 1; i < 29; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        // 그러고 나서 배열에 본 크기만큼 돌리면서 들어가 있는 값이 0인 값을 찾아
        // 뽑아낸다. 리스트의 값이 정해지지 않았을 경우 0이다.
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == 0){
                System.out.println(i);
            }
        }
    }
}
