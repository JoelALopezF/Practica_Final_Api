package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import utils.UserGenerator;
import config.ConfigManager;

public class UserService {

    public Response GetUser(int id){
        ConfigManager config = new ConfigManager();

        RestAssured.baseURI = config.getBase_uri();

        return RestAssured
                .given()
                .header(config.getHeader_x_api_key(),config.getHeader_x_api_key_value())
                .when()
                .get(config.getGuest_path_variable() + id)
                .then()
                .log().all()
                .statusCode(200)
                .body("data", not(empty()))
                .extract()
                .response();
    }
    public Response PostUsers(){
        ConfigManager config = new ConfigManager();
        UserGenerator utils = new UserGenerator();
        String name = utils.fakeName();
        String rol = utils.fakeRol();
        String requestBody = "{ \"name\": \""+name+"\",\"job\": \""+rol+"\" }";
        RestAssured.baseURI = config.getBase_uri();

        return RestAssured
                .given()
                .header(config.getHeader_Content_Type(), config.getHeader_Content_Type_application_json())
                .header(config.getHeader_x_api_key(),config.getHeader_x_api_key_value())
                .body(requestBody)
                .when()
                .post("/api/users")
                .then()
                .log().all()
                .statusCode(201)
                .body("name", equalTo(name))
                .body("job", equalTo(rol))
                .body("id", notNullValue())
                .body("data", not(empty()))
                .extract()
                .response();
    }
    public Response PutUsers(int id){
        ConfigManager config = new ConfigManager();
        UserGenerator utils = new UserGenerator();
        String name = utils.fakeName();
        String rol = utils.fakeRol();
        String requestBody = "{ \"name\": \""+name+"\",\"job\": \""+rol+"\" }";
        RestAssured.baseURI = config.getBase_uri();

        return RestAssured
                .given()
                .header(config.getHeader_Content_Type(), config.getHeader_Content_Type_application_json())
                .header(config.getHeader_x_api_key(),config.getHeader_x_api_key_value())
                .body(requestBody)
                .when()
                .put("/api/users/" + id)
                .then()
                .log().all()
                .statusCode(200)
                .body("data", not(empty()))
                .body("name", equalTo(name))
                .body("job", equalTo(rol))
                .extract()
                .response();
    }
    public Response DeleteUsers(int id){
        ConfigManager config = new ConfigManager();
        RestAssured.baseURI = config.getBase_uri();

        return RestAssured
                .given()
                .header(config.getHeader_x_api_key(),config.getHeader_x_api_key_value())
                .when()
                .delete("/api/users/" + id)
                .then()
                .log().all()
                .statusCode(204)
                .extract()
                .response();
    }
}
