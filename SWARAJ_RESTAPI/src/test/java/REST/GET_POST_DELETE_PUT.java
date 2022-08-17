package REST;

import static io.restassured.RestAssured.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import org.testng.annotations.Test;
import Package.report_extend;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GET_POST_DELETE_PUT extends report_extend {
	public static Properties property;

	public static void prop() {
		try {
			property = new Properties();
			FileInputStream file = new FileInputStream("src/main/resources/prop.properties");
			property.load(file);
		} catch (IOException e) {
		}
	}

	@Test(priority = 1)
	private static void post() throws FileNotFoundException {
		prop();
		String expected_code = property.getProperty("expected_status_code_for_POST");
		
		// baseURI = "https://rahulshettyacademy.com";
		PrintStream add1 = new PrintStream(new FileOutputStream("src\\main\\resources\\POST"));
		
		Response POST_response = given().spec(spec.request()).log().all().queryParam("key", "qaclick123")
				.body(payload2.all()).filter(RequestLoggingFilter.logRequestTo(add1))
				.filter(ResponseLoggingFilter.logResponseTo(add1)).when().post("/maps/api/place/add/json").then().log()
				.all().spec(spec.response()).extract().response();
		
		int actual_co = POST_response.getStatusCode();

		String actual_code = String.valueOf(actual_co);

		String respo = POST_response.asString();

		JsonPath JS_POST = new JsonPath(respo);
		String place_id = JS_POST.get("place_id");
		System.out.println("place id is :- " + place_id);

		property.setProperty("place_id", place_id);
		
		FileOutputStream test = new FileOutputStream("src/main/resources/prop.properties");
		try {
			property.store(test, "changing_value for place_id");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		start_test("Expected and Actual status code should match as 200 FOR POST REQUEST");

		if (actual_code.equalsIgnoreCase(expected_code)) {
			PassTest("Expected and Actual result is matched as 200 FOR POST REQUEST");
		} else {
			fail_test("Expected and Actual result is not matched as 200 FOR POST REQUEST");
		}

	}

	@Test(priority = 2)
	private static void get() throws FileNotFoundException {
		prop();
		
		String expected_code = property.getProperty("expected_status_code_for_GET");

		String updated_place_id = property.getProperty("place_id");
		
		PrintStream add2 = new PrintStream(new FileOutputStream("src\\main\\resources\\GET"));
		
		Response GET_response = given().spec(spec.request()).log().all().queryParam("place_id", updated_place_id)
				.filter(RequestLoggingFilter.logRequestTo(add2)).filter(ResponseLoggingFilter.logResponseTo(add2))
				.when().get("/maps/api/place/get/json").then().log().all().spec(spec.response()).extract().response();
		
		String REPO = GET_response.asString();

		String actual_code = String.valueOf(GET_response.getStatusCode());

		JsonPath JS_GET = new JsonPath(REPO);
		String phone_number = JS_GET.get("phone_number");
		System.out.println("phone number is :- " + phone_number);

		start_test("Expected and Actual status code should match as 200 FOR GET REQUEST");

		if (actual_code.equalsIgnoreCase(expected_code)) {
			PassTest("Expected and Actual result is matched as 200 FOR GET REQUEST");
		} else {
			fail_test("Expected and Actual result is not matched as 200 FOR GET REQUEST");
		}
	}

}
