package SerializationDeSerialization;

import java.io.Serializable;
import java.util.ArrayList;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class WithSerializationAndDeSerialization{

	@Test
	public void postrequestSerialization() {
		
		ArrayList<String> courseslist = new ArrayList<String>();
		courseslist.add("JAVA");
		courseslist.add("SELENIUM");
		
		sampledata sd = new sampledata();
		
		sd.setCourses(courseslist);
		sd.setEmail("abcxyz@gmail.com");
		sd.setFirstname("Rakesh");
		sd.setid(101);
		sd.setJob("Automation Tester");
	    sd.setLastname("Sharma");
	    
	    given()
	       .header("Content-Type","Application/json")
           .body(sd)
	    .when()
	       .post("https://reqres.in/api/users")
	    .then()
	       .statusCode(201)
	       .log().all();
	    
	}
}
