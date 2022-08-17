package RestAssuredTest;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

public class Post_Request {

	@Test
	public void testpostrequest() {

		JSONObject request = new JSONObject();

		request.put("name", "morpheus");
		request.put("job", "zion resident");

		baseURI = "https://reqres.in/api";

		given().header("Content-Type", "Application/json")
				.body(request.toJSONString()).
				when().
				post("/users").
				then()
				.statusCode(201)
				.log().all();

	}
}
