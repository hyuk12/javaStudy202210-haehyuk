package j10_접근지정자;

public class StudentAccessModifier {

    // 변수는 private , 메소드는 public
    private int code;
    private String name;

    public StudentAccessModifier(int code, String name) {
        this.code = code;
        this.name = name;
    }

    // getter , setter 는 앞에 get, set붙고 뒤에 변수명을 카멜표기법으로
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("학번: " + code);
        System.out.println("이름: " + name);
    }
}
