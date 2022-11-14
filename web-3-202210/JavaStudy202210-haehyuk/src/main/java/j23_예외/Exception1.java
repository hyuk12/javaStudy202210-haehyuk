package j23_예외;

/**
 *  예외 처리를 하는 이유는 프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 하기 위해 쓰인다.
 *
 *  자바의 예외에는 일반 예외와 실행 예외가 있다.
 *  각각 checked Exception 과 Unchecked Exception 이 있다.
 *
 *  일반 예외 같은 경우는 개발자가 반드시 예외 처리를 직접 진행해야 한다.
 *  실행 예외는 개발자가 예외 처리를 직접 하지 않아도 된다. 명시적인 예외처리가 강제 되는 것이 아니라 Unchecked 라고 부른다.
 *
 *  컴파일이 되기 전인지 컴파일 이후인지 에따라 구분한다.
 *  컴파일이 되기전은 checked exception , 컴파일 이후에 뜨는 것 Unchecked exception
 */
public class Exception1 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7};

        try {
            String a = null;
            a.toLowerCase();

            for (int i = 0; i < 8; i++){
                System.out.println(numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        }catch (NullPointerException e){
            System.out.println("null pointer to exception");
        }finally {
            System.out.println("항상 실행되어야 하는 서비스");
        }

        System.out.println("프로그램 정상 종료");
    }
}
