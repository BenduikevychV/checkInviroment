package HackerRank;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class The_Hurdle_Race {

    public static void main(String[] args) {


//        given().header("Content-Type", ContentType.JSON).body("")
//                .when().post()
//                .then().assertThat().statusCode(200).extract().response();

        int k = 4;
        int[] height = {1, 6, 3, 5, 2};

        int jump = 0;
        for (int i = 0; i< height.length;i++){
            if (height[i] - k >jump){
                jump = height[i] -k;
            }

        }
        System.out.println(jump);
    }
}
