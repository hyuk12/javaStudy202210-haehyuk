package cs전공지식.디자인패턴.싱글톤패턴;

class Singletone {
    private static class singleInstanceHolder {
        private static final Singletone INSTANCE = new Singletone();
    }
    public static Singletone getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        Singletone a = Singletone.getInstance();
        Singletone b = Singletone.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if (a==b){
            System.out.println(true);
        }
    }
}
