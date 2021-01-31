import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class DemoOne {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("Chigago","Il");
        map.put("New York","NY");

        for (String key : map.keySet()){
            if (map.get(key).equalsIgnoreCase("il")){

            System.out.println(map.get(key));
            }
        }

    }
}
