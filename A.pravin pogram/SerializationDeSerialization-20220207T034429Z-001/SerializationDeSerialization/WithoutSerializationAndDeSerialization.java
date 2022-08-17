package SerializationDeSerialization;

import java.util.ArrayList;
import java.util.HashMap;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class WithoutSerializationAndDeSerialization {

	public HashMap map = new HashMap();
	
	@Test(priority = 0)
	public void postRequest() {
	
		map.put("id", "7");
		map.put("firstname", "Rakesh");
		map.put("lastname", "Sharma");
		map.put("email", "abcxyz@gmail.com");
		map.put("job", "Automation Tester");
		
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("Selenium");
		
		map.put("Courses : ", list);
		
		given()
		      .header("Content-Type","Application/json")
	          .contentType(ContentType.JSON)
	          .accept(ContentType.JSON)
		      .body(map)
		.when()
		      .post("https://reqres.in/api/users")
		.then()
		      .log().all()
		      .statusCode(201);
	}

}
