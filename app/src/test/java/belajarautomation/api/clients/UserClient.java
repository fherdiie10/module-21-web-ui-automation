package belajarautomation.api.clients;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class UserClient {

    private static final String BASE_URL = "https://dummyapi.io/data/v1";

    private static final String APP_ID = "63a804408eb0cb069b57e43a";


    public Response getUserById(String userId) {

        return given()
                .header("app-id", APP_ID)
                .when()
                .get(BASE_URL + "/user/" + userId);
    }


    public Response getUsers() {

        return given()
                .header("app-id", APP_ID)
                .when()
                .get(BASE_URL + "/user");

    }


    public Response getTags() {

        return given()
                .header("app-id", APP_ID)
                .when()
                .get(BASE_URL + "/tag");
    }


    public Response createUser(String body) {

        return given()
                .header("app-id", APP_ID)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(BASE_URL + "/user");

    }


    public Response updateUser(String userId, String body) {

        return given()
                .header("app-id", APP_ID)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(BASE_URL + "/user/" + userId);
    }


    public Response deleteUser(String userId) {

        return given()
                .header("app-id", APP_ID)
                .when()
                .delete(BASE_URL + "/user/" + userId);
    }
}