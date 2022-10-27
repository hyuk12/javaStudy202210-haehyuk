package j10_접근지정자.캡슐화;

public class StudentService {

    public void registerStudent() {
        System.out.println("[ 학생 정보 등록 메뉴]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("student");
        System.out.println("학생정보를 등록합니다.");

    }
    // 중복 체크는 다른데서 쓰지 않는다 고로 private로 보호 해서 이 클래스안에서만 쓰게 한다.
    private boolean doubleCheckStudent(String studentName) {
        if(studentName.equals("student")){
            return false;
        }
        return true;
    }

}
