package j17_스태틱.싱글톤;

public class ViewMain {

    public static void main(String[] args) {
        ProductView a = ProductView.getInstance();
        ProductView b = ProductView.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if(a == b){
            System.out.println(true);
        }
    }
}
