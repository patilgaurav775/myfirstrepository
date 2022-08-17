package RestAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get_Request {

	@Test
	public void getuserdetails() {

		Response response = RestAssured.get("https://reqres.in/api/users/2");

		// Status code of response
		System.out.println("Status code: " + response.getStatusCode());

		// Response Body of API
		System.out.println(response.asString());

		// Status line of response
		System.out.println("Status line: " + response.getStatusLine());

		// Header contains a content type as
		System.out.println("Header: " + response.contentType());

		// Validate the response using Assertion
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Test
	public void getuserdetailsBDD() {

		given()
		.get("http://reqres.in/api/users/3")
		.then()
		.statusCode(200)
		.body("data.id", equalTo(3));
	}
	@Test
	public void GetusersData() {

		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.body("data.first_name[1]", equalTo("Lindsay"))
				.body("data.first_name", hasItems("Michael","Lindsay"))
				.statusCode(200);

	}}
