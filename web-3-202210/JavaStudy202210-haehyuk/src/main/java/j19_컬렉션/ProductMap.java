package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.awt.*;
import java.util.*;
import java.util.List;

@AllArgsConstructor
@Data
class ProductImg{
    private int imgCode;
    private String imgName;

}

public class ProductMap {

    public static void main(String[] args) {

        Map<String, Object> product = new HashMap<String, Object>();
        product.put("productCode", 1);
        product.put("productName", "스타벅스 텀블러");
        product.put("productColor", "Black");
        product.put("productSize", "Venti");

        List<ProductImg> productImgs = new ArrayList<ProductImg>();
        productImgs.add(new ProductImg(1, "starbucks_black_tumbler1.png"));
        productImgs.add(new ProductImg(2, "starbucks_black_tumbler2.png"));
        productImgs.add(new ProductImg(3, "starbucks_black_tumbler3.png"));
        productImgs.add(new ProductImg(4, "starbucks_black_tumbler4.png"));

        product.put("productImg", productImgs);

        System.out.println(product);

        /*
            텀블러 이미지1: starbucks_black_tumbler1.png
            텀블러 이미지2: starbucks_black_tumbler2.png
            텀블러 이미지3: starbucks_black_tumbler3.png
            텀블러 이미지4: starbucks_black_tumbler4.png
         */
        List<ProductImg> products = (List<ProductImg>) product.get("productImg");

        for (ProductImg productImg : products) {
            System.out.println("텀블러 이미지" + productImg.getImgCode() + ": " + productImg.getImgName());
        }

//        System.out.println(products);
//
//
//
//        System.out.println("텀블러 이미지");
    }
}
