package com.example;

import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void deleteUser()
    {
        RestAssured.baseURI = "https://dummyapi.io/data/v1";

        // Perform the DELETE request
        int statusCode = given()
            .header("app-id", "66273c13e26079618814ec16") // Add the app-id header
            .when()
            .delete("/user/6636a22dfeb2af1d510ca6ed") // Specify the endpoint with DELETE method
            .getStatusCode();

        // Print the status code to verify if the deletion was successful
        System.out.println("Response Status Code: " + statusCode);
        if(statusCode == 200) {
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("Failed to delete user. Status code: " + statusCode);
        }
    }
}
