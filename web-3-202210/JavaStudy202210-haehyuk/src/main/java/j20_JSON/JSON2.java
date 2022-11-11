package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User{
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {

    public static void main(String[] args) {
        /** Gson 으로 변환 할 수 있는 객체의 종류
         * JsonObject, Object, Map
         */

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // 두개는 동일하다. 두개의 차이는 .뒤에 속성들을 담아 줄수 있다 builder 같은 경우

        // Object(객체) -> JSON
        User user = new User("hyuko","1234","hyuk7419@gmail.com","최해혁");
        System.out.println(gson.toJson(user));
        System.out.println(gsonBuilder.toJson(user));
        userJson = gsonBuilder.toJson(user);

        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "2022001");
        jsonObject.addProperty("studentName", "최해혁");
        jsonObject.addProperty("studentYear", "2");

        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);

        // Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성 노트북");

        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);

        /** json -> map 으로 변환
         *  map 으로 변환 되어서 get 이나 map 에서 사용가능한 메서드가 사용가능하다
         *  변환을 하더라도 변환 될 때  json 의 키값이 바뀌는 클래스의 키와 같아야 가능하다.
         */
        System.out.println("\n=========================== JsonObject - > map");
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        System.out.println("\n======================== JSON - > JsonObject");

        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);

        System.out.println("\n======================== JSON - > User");
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);
    }

    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        return gson.fromJson(json,Map.class);
    }

    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json,JsonObject.class);
    }

    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json,User.class);
    }
}
