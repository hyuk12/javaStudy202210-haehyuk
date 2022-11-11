package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {

    public static void main(String[] args) {
        // value 값은 object
        // json 은 메소드는 들어갈수 없고 , 키와 밸류로 이루어져 있어야 한다.

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "hyuko");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "hyuk7419@gmail.com");
        jsonObject.addProperty("name", "최해혁");
        jsonObject.addProperty("age",31);

        System.out.println(jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);

        System.out.println();
    }
}
