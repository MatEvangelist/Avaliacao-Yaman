package br.com.evangelista.core.restAPI;

import io.cucumber.java.sl.In;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseRequest {

    protected static String token;
    protected static Response response;

    public Response realizarGet(String API) {
        response = given().when().get("/" + API);
        return response;
    }

    public Response realizarGet(String API, String token) {
        response = given()
                .header("Authorization", "JWT " + token)
                .when().get("/" + API);
        return response;
    }

    public Response realizarPost(String url, String body){
        response = given()
                .header("Authorization", "JWT " + token)
                .log().all()
                .body(body)
                .when()
                .post(url)
                ;

        return response;
    }


    public String getToken(String email, String senha) {
        Map<String, String> login = new HashMap<>();
        login.put("email", email);
        login.put("senha", senha);

        return token = given()
                .body(login)
                .when()
                .post("/signin")
                .then()
                .statusCode(200)
                .extract().path("token");
    }

    public Integer getStatusCode(){
        return response.then()
                .extract().statusCode();
    }

    public String getNomeDaConta() {
        return response.then()
                .extract().body().path("nome");
    }

}
