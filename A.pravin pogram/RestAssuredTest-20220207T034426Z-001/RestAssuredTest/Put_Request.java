package RestAssuredTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Put_Request {
	
	@Test
	public void TestPutRequest() {
		JSONObject request = new JSONObject();

		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		baseURI = "https://reqres.in/api";

		given()
		      .header("Content-Type","Application/json")
//		      .contentType(ContentType.JSON)
//		      .accept(ContentType.JSON)
		      .body(request.toJSONString())
		.when()
		      .put("/users/2")
		.then()
		      .statusCode(200)
		      .log().all();
	}

}
