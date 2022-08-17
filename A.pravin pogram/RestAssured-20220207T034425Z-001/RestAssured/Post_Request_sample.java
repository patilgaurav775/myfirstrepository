package RestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import ModelPOJO.members;
import io.restassured.response.Response;

public class Post_Request_sample {

	@Test(description = "using JSON object to provide body")
	public void postrequestuserjson() {

		baseURI = "https://reqres.in/api";
		
		JSONObject request = new JSONObject();

		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		given()
		    .header("Content-Type", "Application/json")
		    .body(request.toJSONString()).
		when()
		    .post("/users")
	    .then()
		    .statusCode(201)
		    .log().all();

	}
	@Test(description = "using file reading to provide body")
	public void postrequestuserfile() {

		baseURI = "https://reqres.in/api";
		
		File file = new File(System.getProperty("user.dir")+".\\src\\test\\resources\\Payloads\\createnewuser.json");
		
		given()
		    .header("Content-Type", "Application/json")
		    .body(file).
		when()
		    .post("/users")
	    .then()
		    .statusCode(201)
		    .log().all();
}
	@Test(description = "using model POJO to provide body")
	public void postrequestuserPOJO() {

		// POJO :  Plane Old Java Object
		baseURI = "https://reqres.in/api";
		
		members body = new members("morpheus", "leader");
		
		given()
		    .header("Content-Type", "Application/json")
		    .body(body)
		.when()
		    .post("/users")
	    .then()
		    .statusCode(201)
		    .log().all();
}

	
	}

