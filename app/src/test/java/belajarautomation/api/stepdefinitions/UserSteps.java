package belajarautomation.api.stepdefinitions;

import belajarautomation.api.clients.UserClient;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserSteps {


    private UserClient userClient;
    private Response response;


    @Given("user API is ready")
    public void userApiIsReady() {

        userClient = new UserClient();

    }


    @When("I send GET request to get all users")
    public void iSendGETRequestToGetAllUsers() {

        response = userClient.getUsers();

    }


    @When("I send GET request to get all tags")
    public void iSendGETRequestToGetAllTags() {

        response = userClient.getTags();

    }


    @Then("response status code should be {int}")
    public void responseStatusCodeShouldBe(int expectedStatusCode) {


        System.out.println("==============================");
        System.out.println("Expected Status : " + expectedStatusCode);
        System.out.println("Actual Status   : " + response.getStatusCode());
        System.out.println("Response Body   : " + response.getBody().asString());
        System.out.println("==============================");


        assertEquals(
                expectedStatusCode,
                response.getStatusCode()
        );

    }

}