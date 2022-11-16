package baekjun.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 *  구간 합 구하기 문제
 */

public class SumNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberCount = Integer.parseInt(st.nextToken());
        int quizCount = Integer.parseInt(st.nextToken());
        long[] sumNumbers = new long[numberCount + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= numberCount; i++) {
            sumNumbers[i] = sumNumbers[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int q = 0; q < quizCount; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sumNumbers[j] - sumNumbers[i - 1]);
        }
    }
}
