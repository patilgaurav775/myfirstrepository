package RestAssuredTest;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class JsonSchemaValidate {

	@Test
	public void GetusersData() {

		RestAssured.baseURI = "https://reqres.in/api";
		
		given()
		.get("/users?page=2")
		.then()
		.assertThat().body(matchesJsonSchemaInClasspath("Schema_Get.json"))
		.body("data.first_name[1]", equalTo("Lindsay"))
		.statusCode(200);

	}
}
