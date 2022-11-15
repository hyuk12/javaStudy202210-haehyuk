package j25_문자열;



public class String5 {

    public static void main(String[] args) {

        String httpMethod = "Get";

        // 영문자를 대소문자 구분 없이 비교하라 equalsIgnoreCase
        if(httpMethod.equalsIgnoreCase("GeT")){
            System.out.println("get 요청입니다.");
        }else{
            System.out.println("get 요청이 아닙니다.");
        }
    }
}
