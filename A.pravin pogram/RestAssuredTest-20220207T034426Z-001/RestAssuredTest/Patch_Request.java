package RestAssuredTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patch_Request {
	
	@Test
	public void TestpatchRequest() {
	JSONObject request = new JSONObject();

	request.put("name", "morpheus");
	request.put("job", "zion resident");

	given()
	      .header("Content-Type","Application/json")
	      .body(request.toJSONString())
	.when()
	      .patch("https://reqres.in/api/users/2")
	.then()
	      .statusCode(200)
	      .log().all();
	}
}
