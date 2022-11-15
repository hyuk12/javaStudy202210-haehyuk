package 프로그래머스;

import java.util.Arrays;

class Apple {

    public int Apple(int k, int m, int[] score) {

        int answer = 0;
        Arrays.sort(score);

        int[] newScore = new int[score.length];
        for (int i = 0; i < score.length; i++){
            newScore[i] = score[score.length- 1 - i];
        }
        int index = 0;
        for (int i = 0; i < newScore.length; i++){
            if (index >= newScore.length || index + m > newScore.length){
                break;
            }
            answer += newScore[index + m - 1] * m;
            index += m;
        }
        return answer;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.Apple(3,4, new int[]{1, 2, 3, 2, 1});

    }


}
