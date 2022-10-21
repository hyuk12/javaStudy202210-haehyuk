package j07_반복;

public class Loop1 {
    public static void main(String[] args) {

        int result = 0;
        /*
        반복을 해라 .
        i가 0부터 100이 되기 전까지 i를 1씩 증가 시키면서 반복해라
         */

        for (int i = 0; i < 100; i++) {
            result += i + 1;
        }
        System.out.println( "1 ~ 100 까지 더한값: " + result);
    }
}
