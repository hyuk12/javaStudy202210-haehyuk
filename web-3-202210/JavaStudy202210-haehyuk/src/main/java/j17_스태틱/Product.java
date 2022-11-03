package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Product {
    private static int autoIncrement = 2022000;
    private int serialNumber;
    private String productName;

    public Product(String productName){
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }
    public static int getAutoIncrement(){
        return autoIncrement;
    }

    // 스태틱 메서드 안에서는 스태틱 변수만 가능
    // 그냥 멤버변수는 할당이 될수도 안될수도 있기 때문에
    public static void printInfo(){
        Product product = new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }

}
