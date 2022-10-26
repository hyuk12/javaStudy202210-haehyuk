package j08_메소드;

/*
    메소드 오버로딩
    매개변수의 형태가 다르면 동일한 메소드명을 가지고 정의 할 수 있다.
 */

public class OverLoading {

    public static void add(){
        System.out.println("add()");
    }

    public static void add(int a){
        System.out.println("add(int a)");
    }

    public static void add(String s){
        System.out.println("add(String s)");
    }

    public static void add(int a, String s){
        System.out.println("add(int a, String s)");
    }

    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
    }

    public static void add(String a, int b){
        System.out.println("add(String a, int b)");
    }

    public static void add(String a, String b){
        System.out.println("add(String a, String b)");
    }

    public static void main(String[] args) {

        add();
        add(1);
        add("10");
        add(2,"20");
        add(1,2);
        add("3",4);
        add("10","10");
    }

}
