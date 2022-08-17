package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class Get_Request_sample {

	@Test(description = "With non-BDD style")
	public void getuserdata() {

		// Base URI means domain
		RestAssured.baseURI = "https://reqres.in";
		
		// Path parameter of URI
		RestAssured.basePath = "/api/users";
		
		// creating instance of RequestSpecification interface
		RequestSpecification httprequest = RestAssured.given();
		
		// passing header name & value
		Header header = new Header("Content-Type", "Application/json");
		
		httprequest.header(header);
		// Response for GET request method
		Response response = httprequest.request(Method.GET);
		
		// Assertion/ validation of response
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.statusLine(), "HTTP/1.1 200 OK");
		
		// all headers information
		Headers headers = response.headers();
		for (Header hd : headers) {
			System.out.println("key: " + hd.getName() + " " + " value : " + hd.getValue());
		}
		
		// response body with well pretty format
		System.out.println(response.asPrettyString());
	}

	@Test(description = "With BDD style")
	public void getuserdataBDDStyle() {
		baseURI = "https://reqres.in";
		basePath = "/api/users";

		given().
		header("Content-Type", "Application/json")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all();
	}
}
