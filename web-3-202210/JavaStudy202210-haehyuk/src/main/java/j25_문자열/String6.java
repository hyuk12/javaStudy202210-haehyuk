package j25_문자열;



public class String6 {

    public static void main(String[] args) {

        String httpRequest = " ";

        /**
         *  문자열이 비어있지 않으면
         *  1. null !=
         *  2. "" x
         *  3. " " x
         *
         *  isBlank 를 통해 가능 11버전 이상부터 가능
         *  isEmpty 는 블랭크와 차이점으로 공백을 빈것으로 치지않는다.
         */

        if (!httpRequest.isBlank()) {
            System.out.println(httpRequest);
        }else {
            System.out.println("공백은 사용할 수 없습니다.");
        }
    }
}
