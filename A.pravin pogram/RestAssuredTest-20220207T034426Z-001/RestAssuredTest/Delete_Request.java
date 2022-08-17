package RestAssuredTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete_Request {

	@Test
	public void TestDeleteRequest() {

		baseURI = "https://reqres.in/api";

		given()
		      .header("Content-Type","Application/json")
		      .contentType(ContentType.JSON)
		      .accept(ContentType.JSON)
		.when()
		      .delete("/users/2")
		.then()
		      .statusCode(204)
		      .log().all();
	}
}
